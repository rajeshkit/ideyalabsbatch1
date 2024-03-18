package org.ideyalabs.pms.service;

import lombok.AllArgsConstructor;
import org.ideyalabs.pms.dto.ProductDto;
import org.ideyalabs.pms.exception.ProductIdDoesNotExistException;
import org.ideyalabs.pms.model.Product;
import org.ideyalabs.pms.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDto getProductById(int productId) {
        Optional<Product> productOptional=productRepository.findById(productId);
        if(productOptional.isEmpty()){
            throw new ProductIdDoesNotExistException("id is not found");
        }
        return modelMapper.map(productOptional.get(),ProductDto.class);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<ProductDto> productDtoList=productRepository.findAll()
                .stream()
                .map(e->modelMapper.map(e, ProductDto.class))
                .collect(Collectors.toList());

        return productDtoList;
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product=productRepository.save(modelMapper.map(productDto, Product.class));
        return modelMapper.map(product,ProductDto.class);
    }

    @Override
    public ProductDto updateProduct(ProductDto productDto) {
        Product product = productRepository.save(modelMapper.map(productDto,Product.class));
        return modelMapper.map(product,ProductDto.class);
    }

    @Override
    public String deleteProductById(int id) {
        boolean result = productRepository.existsById(id);
        if(result){
            productRepository.deleteById(id);
            return "product with product id"+" "+id+" deleted successfully";
        }
        return "product with product id"+" "+id+" does not exists in the db";
    }

    @Override
    public List<ProductDto> getProductProductName(String productName) {
        List<Product> list = productRepository.findByProductName(productName);
        return list.stream().map(e->modelMapper.map(e, ProductDto.class)).collect(Collectors.toList());
    }
}

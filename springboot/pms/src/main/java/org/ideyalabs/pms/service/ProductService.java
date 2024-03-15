package org.ideyalabs.pms.service;

import org.ideyalabs.pms.dto.ProductDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductService {
    public ProductDto getProductById(int productId);
    public List<ProductDto> getAllProducts();
    public ProductDto createProduct(ProductDto productDto);
    public ProductDto updateProduct(ProductDto productDto);
    public String deleteProductById(int id);
    public List<ProductDto> getProductProductName(String productName);
}

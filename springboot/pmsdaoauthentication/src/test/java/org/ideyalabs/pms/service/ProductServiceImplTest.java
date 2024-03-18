package org.ideyalabs.pms.service;

import org.ideyalabs.pms.dto.ProductDto;
import org.ideyalabs.pms.exception.ProductIdDoesNotExistException;
import org.ideyalabs.pms.model.Product;
import org.ideyalabs.pms.repository.ProductRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

    @InjectMocks
    private ProductServiceImpl productService;
    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetProductById() {
        ProductDto productDto = ProductDto.builder().productId(1).productName("Refrigrator").productCost(20000).build();
        Product product = Product.builder().productId(1).productName("Refrigrator").productCost(20000).build();

        Mockito.when(productRepository.findById(1)).thenReturn(Optional.of(product));

        assertEquals(productDto,productService.getProductById(1));
    }
    @Test
    void testGetProductByIdException() {
        ProductDto productDto = ProductDto.builder().productId(1).productName("Refrigrator").productCost(20000).build();
        Product product = Product.builder().productId(1).productName("Refrigrator").productCost(20000).build();

        Mockito.when(productRepository.findById(10)).thenThrow(ProductIdDoesNotExistException.class);

        assertThrows(ProductIdDoesNotExistException.class,()->{productService.getProductById(10);});
    }

    @Test
    void getAllProducts() {
    }

    @Test
    void createProduct() {
    }

    @Test
    void updateProduct() {
    }

    @Test
    void deleteProductById() {
    }

    @Test
    void getProductProductName() {
    }
}
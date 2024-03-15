package org.ideyalabs.pms.controller;

import org.ideyalabs.pms.dto.ProductDto;
import org.ideyalabs.pms.model.Product;
import org.ideyalabs.pms.service.ProductService;
import org.ideyalabs.pms.service.ProductServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ProductService productService;
    @Test
    void getProductById() throws Exception {
        ProductDto productDto= ProductDto.builder()
                .productId(1)
                .productName("TV")
                .productCost(10000)
                .build();
        Mockito.when(productService.getProductById(1)).thenReturn(productDto);
        this.mockMvc.perform(MockMvcRequestBuilders.get("/product-api/v1/products/1"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath(("$.productId"),is(1)));
    }

    @Test
    void getAllProducts() throws Exception {
        List<ProductDto> productDtoList = Arrays.asList(ProductDto.builder().productId(1).productName("Tv").productCost(1000).build(),
                ProductDto.builder().productId(2).productName("Table").productCost(10000).build(),
                ProductDto.builder().productId(3).productName("Mobile").productCost(100000).build());
        Mockito.when(productService.getAllProducts()).thenReturn(productDtoList);
        this.mockMvc.perform(MockMvcRequestBuilders.get("/product-api/v1/products"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.*",hasSize(3)));
    }

    @Test
    void createProduct() {
    }

    @Test
    void getProductProductName() {
    }

    @Test
    void updateProduct() {
    }

    @Test
    void deleteProductById() {
    }
}
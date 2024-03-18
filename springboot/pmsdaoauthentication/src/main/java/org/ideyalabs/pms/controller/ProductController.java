package org.ideyalabs.pms.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.ideyalabs.pms.dto.ApiError;
import org.ideyalabs.pms.dto.ProductDto;
import org.ideyalabs.pms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product-api/v1")
public class ProductController {

    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/products/{id}")
    public ProductDto getProductById(@PathVariable("id") int productId){
        return productService.getProductById(productId);
    }
    @GetMapping(value = "/products")
    public List<ProductDto> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping(value = "/products",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<ProductDto> createProduct(@Valid @RequestBody ProductDto productDto){
        return new ResponseEntity<ProductDto>(productService.createProduct(productDto), HttpStatus.CREATED) ;
    }
    @GetMapping(value = "/products/name/{productName}")
    public List<ProductDto> getProductProductName(@PathVariable String productName){
        return productService.getProductProductName(productName);
    }
    @PutMapping(value = "/products")
    public ProductDto updateProduct( @RequestBody ProductDto productDto){
        return productService.updateProduct(productDto);

    }
    @DeleteMapping(value = "/products/{id}")
    public String deleteProductById(@PathVariable("id") int productId){
        return productService.deleteProductById(productId);
    }

}

package org.ideyalabs.pms.repository;

import org.ideyalabs.pms.model.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.print.attribute.standard.PresentationDirection;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        Product product= Product.builder()
                .productId(100)
                .productName("TV")
                .productCost(100000)
                .build();
        productRepository.save(product);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findByProductName() {
        List<Product> actuals = productRepository.findByProductName("TV");
        assertEquals(1,actuals.get(0).getProductId());
        assertEquals("TV",actuals.get(0).getProductName());
        assertEquals(100000,actuals.get(0).getProductCost());
    }

}
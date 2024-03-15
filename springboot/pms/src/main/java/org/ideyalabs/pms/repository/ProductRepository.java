package org.ideyalabs.pms.repository;

import org.ideyalabs.pms.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.util.List;

public interface ProductRepository
        extends JpaRepository<Product,Integer> {
    public List<Product> findByProductName(String productName);

}

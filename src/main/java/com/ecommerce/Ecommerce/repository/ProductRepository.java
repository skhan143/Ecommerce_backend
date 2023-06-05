package com.ecommerce.Ecommerce.repository;

import com.ecommerce.Ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

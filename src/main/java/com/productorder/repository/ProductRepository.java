package com.productorder.repository;


import com.productorder.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // find products by name
    List<Product> findByNameContainingIgnoreCase(String name);

    // find products with price less than given value
    List<Product> findByPriceLessThan(Double price);
}

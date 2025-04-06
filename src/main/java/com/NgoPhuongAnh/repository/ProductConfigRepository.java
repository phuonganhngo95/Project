package com.NgoPhuongAnh.repository;

import com.NgoPhuongAnh.entity.ProductConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductConfigRepository extends JpaRepository<ProductConfig, Long> {
    @Query("SELECT pc FROM ProductConfig pc WHERE pc.idProduct = :productId")
    List<ProductConfig> findByProductId(@Param("productId") Long productId);
}

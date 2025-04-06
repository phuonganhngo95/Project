package com.NgoPhuongAnh.repository;

import com.NgoPhuongAnh.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductImagesRepository extends JpaRepository<ProductImage, Long> {
    @Query("SELECT pi FROM ProductImage pi WHERE LOWER(pi.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<ProductImage> findByName(@Param("name") String name);
}

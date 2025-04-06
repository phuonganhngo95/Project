package com.NgoPhuongAnh.repository;

import com.NgoPhuongAnh.entity.Category;
import com.NgoPhuongAnh.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
    @Query("SELECT pm FROM PaymentMethod pm WHERE LOWER(pm.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<PaymentMethod> findByName(@Param("name") String name);
}

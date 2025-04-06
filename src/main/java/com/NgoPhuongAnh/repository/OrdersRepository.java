package com.NgoPhuongAnh.repository;

import com.NgoPhuongAnh.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
    @Query("SELECT o FROM Orders o WHERE o.idOrders = :orderId")
    List<Orders> findByOrderId(@Param("orderId") String orderId);
}

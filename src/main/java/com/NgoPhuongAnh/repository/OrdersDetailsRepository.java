package com.NgoPhuongAnh.repository;

import com.NgoPhuongAnh.entity.OrdersDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersDetailsRepository extends JpaRepository<OrdersDetails, Long> {
    @Query("SELECT od FROM OrdersDetails od WHERE od.idOrd = :orderId")
    List<OrdersDetails> findByOrderId(@Param("orderId") Long orderId);
}

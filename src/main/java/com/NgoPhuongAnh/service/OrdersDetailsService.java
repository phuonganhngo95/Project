package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.OrdersDetails;
import com.NgoPhuongAnh.repository.OrdersDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersDetailsService {
    @Autowired
    private OrdersDetailsRepository ordersDetailsRepository;

    public List<OrdersDetails> getAllOrdersDetails() {
        return ordersDetailsRepository.findAll();
    }

    public Optional<OrdersDetails> findOrdersDetailsById(Long id) {
        return ordersDetailsRepository.findById(id);
    }

    public OrdersDetails saveOrdersDetails(OrdersDetails ordersDetails) {
        return ordersDetailsRepository.save(ordersDetails);
    }

    public OrdersDetails updateOrdersDetails(Long id, OrdersDetails ordersDetails) {
        OrdersDetails ordersDetail = ordersDetailsRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy chi tiết háo đơn với id: " + id));
        ordersDetail.setIdOrd(ordersDetails.getIdOrd());
        ordersDetail.setIdProduct(ordersDetails.getIdProduct());
        ordersDetail.setPrice(ordersDetails.getPrice());
        ordersDetail.setQty(ordersDetails.getQty());
        ordersDetail.setTotal(ordersDetails.getTotal());
        ordersDetail.setReturnQty(ordersDetails.getReturnQty());

        return ordersDetailsRepository.save(ordersDetail);
    }

    public void deleteOrdersDetails(Long id) {
        OrdersDetails ordersDetails = ordersDetailsRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy chi tiết hóa đơn với id: " + id));
        ordersDetailsRepository.delete(ordersDetails);
    }

    public List<OrdersDetails> findOrdersDetailsByOrderId(Long orderId) {
        return ordersDetailsRepository.findByOrderId(orderId);
    }
}

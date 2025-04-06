package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.Orders;
import com.NgoPhuongAnh.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    public Optional<Orders> findOrdersById(Long id) {
        return ordersRepository.findById(id);
    }

    public Orders saveOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

    public Orders updateOrders(Long id, Orders ordersDetails) {
        Orders orders = ordersRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy hóa đơn khách hàng với id: " + id));
        orders.setIdOrders(ordersDetails.getIdOrders());
        orders.setOrdersDate(ordersDetails.getOrdersDate());
        orders.setIdCustomer(ordersDetails.getIdCustomer());
        orders.setIdPayment(ordersDetails.getIdPayment());
        orders.setIdTransport(ordersDetails.getIdTransport());
        orders.setTotalMoney(ordersDetails.getTotalMoney());
        orders.setNotes(ordersDetails.getNotes());
        orders.setNameReceiver(ordersDetails.getNameReceiver());
        orders.setAddress(ordersDetails.getAddress());
        orders.setEmail(ordersDetails.getEmail());
        orders.setPhone(ordersDetails.getPhone());
        orders.setIsDelete(ordersDetails.getIsDelete());
        orders.setIsActive(ordersDetails.getIsActive());

        return ordersRepository.save(orders);
    }

    public void deleteOrders(Long id) {
        Orders orders = ordersRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy hóa đơn khách hàng với id: " + id));
        ordersRepository.delete(orders);
    }

    public List<Orders> findOrdersById(String orderId) {
        return ordersRepository.findByOrderId(orderId);
    }
}

package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.PaymentMethod;
import com.NgoPhuongAnh.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodService {
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    public List<PaymentMethod> getAllPaymentMethods() {
        return paymentMethodRepository.findAll();
    }

    public Optional<PaymentMethod> findPaymentMethodById(Long id) {
        return paymentMethodRepository.findById(id);
    }

    public PaymentMethod savePaymentMethod(PaymentMethod paymentMethod) {
        return paymentMethodRepository.save(paymentMethod);
    }

    public PaymentMethod updatePaymentMethod(Long id, PaymentMethod paymentMethodDetails) {
        PaymentMethod paymentMethod = paymentMethodRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy phương thức thanh toán với id: " + id));
        paymentMethod.setName(paymentMethodDetails.getName());
        paymentMethod.setNotes(paymentMethodDetails.getNotes());
        paymentMethod.setCreatedDate(paymentMethodDetails.getCreatedDate());
        paymentMethod.setUpdatedDate(paymentMethodDetails.getUpdatedDate());
        paymentMethod.setIsDelete(paymentMethodDetails.getIsDelete());
        paymentMethod.setIsActive(paymentMethodDetails.getIsActive());

        return paymentMethodRepository.save(paymentMethod);
    }

    public void deletePaymentMethod(Long id) {
        PaymentMethod paymentMethod = paymentMethodRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy phương thức thanh toán với id: " + id));
        paymentMethodRepository.delete(paymentMethod);
    }

    public List<PaymentMethod> findPaymentMethodByName(String name) {
        return paymentMethodRepository.findByName(name);
    }
}

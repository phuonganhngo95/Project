package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.Customer;
import com.NgoPhuongAnh.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long id, Customer customerDetails) {
        Customer customer = customerRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy khách hàng với id: " + id));
        customer.setName(customerDetails.getName());
        customer.setUsername(customerDetails.getUsername());
        customer.setPassword(customerDetails.getPassword());
        customer.setAddress(customerDetails.getAddress());
        customer.setEmail(customerDetails.getEmail());
        customer.setPhone(customerDetails.getPhone());
        customer.setAvatar(customerDetails.getAvatar());
        customer.setCreatedDate(customerDetails.getCreatedDate());
        customer.setUpdatedDate(customerDetails.getUpdatedDate());
        customer.setCreatedBy(customerDetails.getCreatedBy());
        customer.setUpdatedBy(customerDetails.getUpdatedBy());
        customer.setIsDelete(customerDetails.getIsDelete());
        customer.setIsActive(customerDetails.getIsActive());

        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy khách hàng với id: " + id));
        customerRepository.delete(customer);
    }

    public List<Customer> findCustomerByName(String name) {
        return customerRepository.findByName(name);
    }
}

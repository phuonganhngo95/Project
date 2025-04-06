package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.CustomerDTO;
import com.NgoPhuongAnh.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper MAPPER = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO mapToCustomerDTO(Customer customer);

    Customer maptoCustomer(CustomerDTO customerDTO);
}

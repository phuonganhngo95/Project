package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.OrdersDetailsDTO;
import com.NgoPhuongAnh.entity.OrdersDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrdersDetailsMapper {
    OrdersDetailsMapper MAPPER = Mappers.getMapper(OrdersDetailsMapper.class);

    OrdersDetailsDTO mapToOrdersDetailsDTO(OrdersDetails ordersDetails);

    OrdersDetails mapToOrdersDetails(OrdersDetailsDTO ordersDetailsDTO);
}

package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.OrdersDTO;
import com.NgoPhuongAnh.entity.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrdersMapper {
    OrdersMapper MAPPER = Mappers.getMapper(OrdersMapper.class);

    OrdersDTO mapToOrdersDTO(Orders orders);

    Orders mapToOrders(OrdersDTO ordersDTO);
}

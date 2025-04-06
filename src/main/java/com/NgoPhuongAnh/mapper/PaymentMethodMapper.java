package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.PaymentMethodDTO;
import com.NgoPhuongAnh.entity.PaymentMethod;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentMethodMapper {
    PaymentMethodMapper MAPPER = Mappers.getMapper(PaymentMethodMapper.class);

    PaymentMethodDTO mapToPaymentMethodDTO(PaymentMethod paymentMethod);

    PaymentMethod mapToPaymentMethod(PaymentMethodDTO paymentMethodDTO);
}

package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.TransportMethodDTO;
import com.NgoPhuongAnh.entity.TransportMethod;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransportMethodMapper {
    TransportMethodMapper MAPPER = Mappers.getMapper(TransportMethodMapper.class);

    TransportMethodDTO mapToTransportMethodDTO(TransportMethod transportMethod);

    TransportMethod mapToTransportMethod(TransportMethodDTO transportMethodDTO);
}

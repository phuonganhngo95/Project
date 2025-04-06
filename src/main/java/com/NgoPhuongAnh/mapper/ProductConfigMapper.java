package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.ProductConfigDTO;
import com.NgoPhuongAnh.entity.ProductConfig;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductConfigMapper {
    ProductConfigMapper MAPPER = Mappers.getMapper(ProductConfigMapper.class);

    ProductConfigDTO maptoProductConfigDTO(ProductConfig productConfig);

    ProductConfig mapToProductConfig(ProductConfigDTO productConfigDTO);
}

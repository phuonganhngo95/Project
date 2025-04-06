package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.ProductImageDTO;
import com.NgoPhuongAnh.entity.ProductImage;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductImageMapper {
    ProductImageMapper MAPPER = Mappers.getMapper(ProductImageMapper.class);

    ProductImageDTO mapToProductImageDTO(ProductImage productImage);

    ProductImage mapToProductImage(ProductImageDTO productImageDTO);
}

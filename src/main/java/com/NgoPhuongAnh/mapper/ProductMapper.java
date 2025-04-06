package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.ProductDTO;
import com.NgoPhuongAnh.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductDTO mapToProductDTO(Product product);

    Product mapToProduct(ProductDTO productDTO);
}

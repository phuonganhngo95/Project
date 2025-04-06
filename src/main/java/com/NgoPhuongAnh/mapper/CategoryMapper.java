package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.CategoryDTO;
import com.NgoPhuongAnh.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper MAPPER = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO mapToCategoryDTO(Category category);

    Category mapToCategory(CategoryDTO categoryDTO);
}

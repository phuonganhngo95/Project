package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.NewsCategoryDTO;
import com.NgoPhuongAnh.entity.NewsCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewsCategoryMapper {
    NewsCategoryMapper MAPPER = Mappers.getMapper(NewsCategoryMapper.class);

    NewsCategoryDTO mapToNewsCategoryDTO(NewsCategory newsCategory);

    NewsCategory mapToNewsCategory(NewsCategoryDTO newsCategoryDTO);
}

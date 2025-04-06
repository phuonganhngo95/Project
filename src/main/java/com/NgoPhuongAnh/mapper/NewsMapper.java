package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.NewsDTO;
import com.NgoPhuongAnh.entity.News;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewsMapper {
    NewsMapper MAPPER = Mappers.getMapper(NewsMapper.class);

    NewsDTO mapToNewsDTO(News news);

    News mapToNews(NewsDTO newsDTO);
}

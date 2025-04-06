package com.NgoPhuongAnh.mapper;

import com.NgoPhuongAnh.dto.ConfigurationsDTO;
import com.NgoPhuongAnh.entity.Configurations;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConfigurationsMapper {
    ConfigurationsMapper MAPPER = Mappers.getMapper(ConfigurationsMapper.class);

    ConfigurationsDTO mapToConfigurationsDTO(Configurations configurations);

    Configurations mapToConfigurations(ConfigurationsDTO configurationsDTO);
}

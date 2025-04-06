package com.NgoPhuongAnh.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductConfigDTO {
    Long id;

    Long idProduct;
    Long idConfig;

    @NotBlank(message = "Giá trị không được để trống")
    @NotNull(message = "Giá trị không được để null")
    @NotEmpty(message = "Giá trị không được rỗng")
    String value;
}
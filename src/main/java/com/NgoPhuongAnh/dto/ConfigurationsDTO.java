package com.NgoPhuongAnh.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfigurationsDTO {
    Long id;

    @NotBlank(message = "Tên cấu hình không được để trống")
    @NotNull(message = "Tên cấu hình không được để null")
    @NotEmpty(message = "Tên cấu hình không được rỗng")
    @Size(max = 500, message = "Tên cấu hình không được vượt quá 500 ký tự")
    String name;

    @NotBlank(message = "Mô tả thêm không được để trống")
    @NotNull(message = "Mô tả thêm không được để null")
    @NotEmpty(message = "Mô tả thêm không được rỗng")
    String notes;

    @NotNull(message = "Trạng thái xóa không được để null")
    Boolean isDelete;

    @NotNull(message = "Trạng thái hiển thị không được để null")
    Boolean isActive;
}
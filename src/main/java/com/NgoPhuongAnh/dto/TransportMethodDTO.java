package com.NgoPhuongAnh.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransportMethodDTO {
    Long id;

    @NotBlank(message = "Tên phương thức không được để trống")
    @NotNull(message = "Tên phương thức không được để null")
    @NotEmpty(message = "Tên phương thức không được rỗng")
    @Size(max = 250, message = "Tên phương thức không được vượt quá 250 ký tự")
    String name;

    @NotBlank(message = "Ghi chú thêm không được để trống")
    @NotNull(message = "Ghi chú thêm không được để null")
    @NotEmpty(message = "Ghi chú thêm không được rỗng")
    String notes;

    @NotBlank(message = "Ngày tạo không được để trống")
    @NotNull(message = "Ngày tạo không được để null")
    @NotEmpty(message = "Ngày tạo không được rỗng")
    Date createDate;

    @NotBlank(message = "Ngày sửa không được để trống")
    @NotNull(message = "Ngày sửa không được để null")
    @NotEmpty(message = "Ngày sửa không được rỗng")
    Date updatedDate;

    @NotNull(message = "Trạng thái xóa không được để null")
    Byte isDelete;

    @NotNull(message = "Trạng thái hiển thị không được để null")
    Byte isActive;
}
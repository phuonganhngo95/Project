package com.NgoPhuongAnh.dto;

import jakarta.persistence.Column;
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
public class CustomerDTO {
    Long id;

    @NotBlank(message = "Họ tên khách hàng không được để trống")
    @NotNull(message = "Ho tên khách hàng không được để null")
    @NotEmpty(message = "Họ tên khách hàng không được rỗng")
    @Size(max = 250, message = "Họ tên khách hàng không được vượt quá 250 ký tự")
    String name;

    @NotBlank(message = "Tài khoản không được để trống")
    @NotNull(message = "Tài khoản không được để null")
    @NotEmpty(message = "Tài khoản không được rỗng")
    @Size(max = 50, message = "Tài khoản không được vượt quá 50 ký tự")
    String username;

    @NotBlank(message = "Mật khẩu không được để trống")
    @NotNull(message = "Mật khẩu không được để null")
    @NotEmpty(message = "Mật khẩu không được rỗng")
    @Size(max = 32, message = "Mật khẩu không được vượt quá 32 ký tự")
    String password;

    @NotBlank(message = "Địa chỉ không được để trống")
    @NotNull(message = "Địa chỉ không được để null")
    @NotEmpty(message = "Địa chỉ không được rỗng")
    @Size(max = 500, message = "Địa chỉ không được vượt quá 500 ký tự")
    String address;

    @NotBlank(message = "Hộp thư không được để trống")
    @NotNull(message = "Hộp thư không được để null")
    @NotEmpty(message = "Hộp thư không được rỗng")
    @Size(max = 150, message = "Hộp thư không được vượt quá 150 ký tự")
    String email;

    @NotBlank(message = "Điện thoại không được để trống")
    @NotNull(message = "Điện thoại không được để null")
    @NotEmpty(message = "Điện thoại không được rỗng")
    @Size(max = 50, message = "Điện thoại không được vượt quá 50 ký tự")
    String phone;

    @NotBlank(message = "Ảnh đại diện không được để trống")
    @NotNull(message = "Ảnh đại diện không được để null")
    @NotEmpty(message = "Ảnh đại diện không được rỗng")
    @Size(max = 250, message = "Ảnh đại diện không được vượt quá 250 ký tự")
    String avatar;

    @NotBlank(message = "Ngày tạo không được để trống")
    @NotNull(message = "Ngày tạo không được để null")
    @NotEmpty(message = "Ngày tạo không được rỗng")
    Date createDate;

    @NotBlank(message = "Ngày sửa không được để trống")
    @NotNull(message = "Ngày sửa không được để null")
    @NotEmpty(message = "Ngày sửa không được rỗng")
    Date updatedDate;

    Long createdBy;
    Long updatedBy;

    @NotNull(message = "Trạng thái xóa không được để null")
    Byte isDelete;

    @NotNull(message = "Trạng thái hiển thị không được để null")
    Byte isActive;
}
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
public class ProductImageDTO {
    Long id;

    @NotBlank(message = "Tên file ảnh không được để trống")
    @NotNull(message = "Tên file ảnhkhông được để null")
    @NotEmpty(message = "Tên file ảnh không được rỗng")
    @Size(max = 250, message = "Tên file ảnh không được vượt quá 250 ký tự")
    String name;

    @NotBlank(message = "Đường dẫn ảnh không được để trống")
    @NotNull(message = "Đường dẫn ảnh không được để null")
    @NotEmpty(message = "Đường dẫn ảnh không được rỗng")
    @Size(max = 250, message = "Đường dẫn ảnh không được vượt quá 250 ký tự")
    String urlImg;

    Long idProduct;
}
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
public class NewsDTO {
    Long id;

    @NotBlank(message = "Tên tin tức không được để trống")
    @NotNull(message = "Tên tin tức không được để null")
    @NotEmpty(message = "Tên tin tức không được rỗng")
    @Size(max = 500, message = "Tên tin tức không được vượt quá 500 ký tự")
    String name;

    @NotBlank(message = "Nội dung mô tả ngắn không được để trống")
    @NotNull(message = "Nội dung mô tả ngắn không được để null")
    @NotEmpty(message = "Nội dung mô tả ngắn không được rỗng")
    String description;

    @NotBlank(message = "Hình ảnh đại diện không được để trống")
    @NotNull(message = "Hình ảnh đại diện không được để null")
    @NotEmpty(message = "Hình ảnh đại diện không được rỗng")
    @Size(max = 550, message = "Hình ảnh đại diện không được vượt quá 550 ký tự")
    String image;

    Long idNewsCategory;

    @NotBlank(message = "Nội dung tin tức bài viết không được để trống")
    @NotNull(message = "Nội dung tin tức bài viết không được để null")
    @NotEmpty(message = "Nội dung tin tức bài viết không được rỗng")
    String contents;

    @NotBlank(message = "Url không được để trống")
    @NotNull(message = "Url không được để null")
    @NotEmpty(message = "Url không được rỗng")
    @Size(max = 160, message = "Url không được vượt quá 160 ký tự")
    String slug;

    @NotBlank(message = "Tiêu đề không được để trống")
    @NotNull(message = "Tiêu đề không được để null")
    @NotEmpty(message = "Tiêu đề không được rỗng")
    @Size(max = 100, message = "Tiêu đề không được vượt quá 100 ký tự")
    String metaTitle;

    @NotBlank(message = "Từ khóa không được để trống")
    @NotNull(message = "Từ khóa không được để null")
    @NotEmpty(message = "Từ khóa không được rỗng")
    @Size(max = 500, message = "Từ khóa không được vượt quá 500 ký tự")
    String metaKeyword;

    @NotBlank(message = "Mô tả không dược để trống")
    @NotNull(message = "Mô tả không được để null")
    @NotEmpty(message = "Mô tả không được rỗng")
    @Size(max = 500, message = "Mô tả không được vượt quá 500 ký tự")
    String metaDescription;

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
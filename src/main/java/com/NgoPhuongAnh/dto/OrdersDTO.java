package com.NgoPhuongAnh.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrdersDTO {
    Long id;

    @NotBlank(message = "Mã hóa đơn không được để trống")
    @NotNull(message = "Mã hóa đơn không được để null")
    @NotEmpty(message = "Mã hóa đơn không được rỗng")
    @Size(max = 10, message = "Mã hóa đơn không được vượt quá 10 ký tự")
    String idOrders;

    @NotNull(message = "Ngày hóa đơn không được để null")
    Date ordersDate;

    Long idCustomer;
    Long idPayment;
    Long idTransport;

    @NotNull(message = "Tổng tiền không được để null")
    BigDecimal totalMoney;

    @NotBlank(message = "Ghi chú  không được để trống")
    @NotNull(message = "Ghi chú không được để null")
    @NotEmpty(message = "Ghi chú  không được rỗng")
    String notes;

    @NotBlank(message = "Họ tên người nhận không được để trống")
    @NotNull(message = "Họ tên người nhận không được để null")
    @NotEmpty(message = "Họ tên người nhận không được rỗng")
    @Size(max = 250, message = "Họ tên người nhận không được vượt quá 250 ký tự")
    String nameReceiver;

    @NotBlank(message = "Địa chỉ người nhận không được để trống")
    @NotNull(message = "Địa chỉ người nhận không được để null")
    @NotEmpty(message = "Địa chỉ người nhận không được rỗng")
    @Size(max = 500, message = "Địa chỉ người nhận không được vượt quá 500 ký tự")
    String address;

    @NotBlank(message = "Hộp thư người nhận không được để trống")
    @NotNull(message = "Hộp thư người nhận không được để null")
    @NotEmpty(message = "Hộp thư người nhận không được rỗng")
    @Size(max = 150, message = "Hợp thư người nhận không được vượt quá 150 ký tự")
    String email;

    @NotBlank(message = "Điện thoại người nhận không được để trống")
    @NotNull(message = "Điện thoại người nhận không được để null")
    @NotEmpty(message = "Điện thoại người nhận không được rỗng")
    @Size(max = 50, message = "Mã hóa đơn không được vượt quá 50 ký tự")
    String phone;

    @NotNull(message = "Trạng thái xóa không được để null")
    Byte isDelete;

    @NotNull(message = "Trạng thái hiển thị không được để null")
    Byte isActive;
}
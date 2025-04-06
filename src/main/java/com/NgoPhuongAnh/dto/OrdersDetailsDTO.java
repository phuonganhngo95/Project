package com.NgoPhuongAnh.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrdersDetailsDTO {
    Long id;
    Long idOrd;
    Long idProduct;

    @NotNull(message = "Giá mua không được để null")
    BigDecimal price;

    @NotNull(message = "Số lượng mua không được để null")
    Integer qty;

    @NotNull(message = "Tổng thành tiền mua không được để null")
    BigDecimal total;

    @NotNull(message = "Số lượng trả lại không được để null")
    Integer returnQty;
}
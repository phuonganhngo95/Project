package com.NgoPhuongAnh.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "orders_detail")
public class OrdersDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long idOrd;
    Long idProduct;

    @Column(name = "price", precision = 10, scale = 2)
    BigDecimal price;

    @Column(name = "qty")
    Integer qty;

    @Column(name = "total", precision = 10, scale = 2)
    BigDecimal total;

    @Column(name = "returnQty")
    Integer returnQty;

    @ManyToOne
    @JoinColumn(name = "idOrd", insertable = false, updatable = false)
    Orders order;

    @ManyToOne
    @JoinColumn(name = "idProduct", insertable = false, updatable = false)
    Product product;
}

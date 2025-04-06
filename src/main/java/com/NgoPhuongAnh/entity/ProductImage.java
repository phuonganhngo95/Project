package com.NgoPhuongAnh.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", length = 250)
    String name;

    @Column(name = "urlImg", length = 250)
    String urlImg;

    Long idProduct;

    @ManyToOne
    @JoinColumn(name = "idProduct", insertable = false, updatable = false)
    Product product;
}

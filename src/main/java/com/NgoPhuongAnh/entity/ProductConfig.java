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
@Table(name = "product_config")
public class ProductConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long idProduct;
    Long idConfig;

    @Column(name = "value")
    String value;

    @ManyToOne
    @JoinColumn(name = "idProduct", insertable = false, updatable = false)
    Product product;

    @ManyToOne
    @JoinColumn(name = "idConfig", insertable = false, updatable = false)
    Configurations configuration;
}

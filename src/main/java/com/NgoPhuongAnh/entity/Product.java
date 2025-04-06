package com.NgoPhuongAnh.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", length = 500)
    String name;

    @Column(name = "description", columnDefinition = "text")
    String description;

    @Column(name = "notes", columnDefinition = "text")
    String notes;

    @Column(name = "image", length = 550)
    String image;

    @Column(name = "idCategory")
    Long idCategory;

    @Column(name = "contents", columnDefinition = "text")
    String contents;

    @Column(name = "price", precision = 10, scale = 2)
    BigDecimal price;

    @Column(name = "quantity")
    Integer quantity;

    @Column(name = "slug", length = 160)
    String slug;

    @Column(name = "meta_title", length = 100)
    String metaTitle;

    @Column(name = "meta_keyword", length = 500)
    String metaKeyword;

    @Column(name = "meta_description", length = 500)
    String metaDescription;

    @Column(name = "created_date")
    Date createdDate;

    @Column(name = "updated_date")
    Date updatedDate;

    @Column(name = "created_by")
    Long createdBy;

    @Column(name = "updated_by")
    Long updatedBy;

    @Column(name = "isDelete")
    Byte isDelete;

    @Column(name = "isActive")
    Byte isActive;

    @ManyToOne
    @JoinColumn(name = "idCategory", insertable = false, updatable = false)
    Category category;

    @OneToMany(mappedBy = "product")
    List<ProductConfig> productConfigurations;

    @OneToMany(mappedBy = "product")
    List<ProductImage> productImages;

    @OneToMany(mappedBy = "product")
    List<OrdersDetails> ordersDetails;
}

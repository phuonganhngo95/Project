package com.NgoPhuongAnh.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", length = 500)
    String name;

    @Column(name = "notes", columnDefinition = "text")
    String notes;

    @Column(name = "icon", length = 250)
    String icon;

    @Column(name = "idParent")
    Long idParent;

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

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    List<Product> products;

    @OneToMany(mappedBy = "parentCategory", cascade = CascadeType.ALL)
    List<Category> subCategories;

    @ManyToOne
    @JoinColumn(name = "idParent", insertable = false, updatable = false)
    Category parentCategory;
}
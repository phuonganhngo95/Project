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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", length = 250)
    String name;

    @Column(name = "username", length = 50)
    String username;

    @Column(name = "password", length = 32)
    String password;

    @Column(name = "address", length = 500)
    String address;

    @Column(name = "email", length = 150)
    String email;

    @Column(name = "phone", length = 50)
    String phone;

    @Column(name = "avatar", length = 250)
    String avatar;

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

    @OneToMany(mappedBy = "customer")
    List<Orders> orders;
}

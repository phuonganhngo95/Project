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
@Table(name = "transport_method")
public class TransportMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", length = 250)
    String name;

    @Column(name = "notes", columnDefinition = "text")
    String notes;

    @Column(name = "created_date")
    Date createdDate;

    @Column(name = "updated_date")
    Date updatedDate;

    @Column(name = "isDelete")
    Byte isDelete;

    @Column(name = "isActive")
    Byte isActive;

    @OneToMany(mappedBy = "transportMethod", cascade = CascadeType.ALL)
    List<Orders> orders;
}

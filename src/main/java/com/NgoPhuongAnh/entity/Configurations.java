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
@Table(name = "configurations")
public class Configurations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", length = 500)
    String name;

    @Column(name = "notes", columnDefinition = "text")
    String notes;

    @Column(name = "isDelete")
    Boolean isDelete;

    @Column(name = "isActive")
    Boolean isActive;
}

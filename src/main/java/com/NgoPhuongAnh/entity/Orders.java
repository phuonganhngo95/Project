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
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "idOrders", length = 10)
    String idOrders;

    @Column(name = "orderDate")
    Date ordersDate;

    Long idCustomer;
    Long idPayment;
    Long idTransport;

    @Column(name = "totalMoney", precision = 10, scale = 2)
    BigDecimal totalMoney;

    @Column(name = "notes", columnDefinition = "text")
    String notes;

    @Column(name = "nameReceiver", length = 250)
    String nameReceiver;

    @Column(name = "address", length = 500)
    String address;

    @Column(name = "email", length = 150)
    String email;

    @Column(name = "phone", length = 50)
    String phone;

    @Column(name = "isDelete")
    Byte isDelete;

    @Column(name = "isActive")
    Byte isActive;

    @ManyToOne
    @JoinColumn(name = "idCustomer", insertable = false, updatable = false)
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "idPayment", insertable = false, updatable = false)
    PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "idTransport", insertable = false, updatable = false)
    TransportMethod transportMethod;

    @OneToMany(mappedBy = "order")
    List<OrdersDetails> ordersDetails;
}

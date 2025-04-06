package com.NgoPhuongAnh.repository;

import com.NgoPhuongAnh.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT c FROM Customer c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Customer> findByName(@Param("name") String name);

//    @Query("SELECT c FROM Customer c WHERE LOWER(c.username) LIKE LOWER(CONCAT('%', :username, '%'))")
//    List<Customer> findByUsername(@Param("username") String username);
}

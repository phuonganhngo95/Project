package com.NgoPhuongAnh.repository;

import com.NgoPhuongAnh.entity.Category;
import com.NgoPhuongAnh.entity.TransportMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransportMethodRepository extends JpaRepository<TransportMethod, Long> {
    @Query("SELECT tm FROM TransportMethod tm WHERE LOWER(tm.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<TransportMethod> findByName(@Param("name") String name);
}

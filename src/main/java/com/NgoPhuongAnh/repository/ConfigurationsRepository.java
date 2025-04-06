package com.NgoPhuongAnh.repository;

import com.NgoPhuongAnh.entity.Configurations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfigurationsRepository extends JpaRepository<Configurations, Long> {
    @Query("SELECT c FROM Configurations c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Configurations> findByName(@Param("name") String name);
}

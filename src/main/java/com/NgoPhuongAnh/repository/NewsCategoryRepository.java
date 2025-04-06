package com.NgoPhuongAnh.repository;

import com.NgoPhuongAnh.entity.NewsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsCategoryRepository extends JpaRepository<NewsCategory, Long> {
    @Query("SELECT nc FROM NewsCategory nc WHERE LOWER(nc.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<NewsCategory> findByName(@Param("name") String name);
}

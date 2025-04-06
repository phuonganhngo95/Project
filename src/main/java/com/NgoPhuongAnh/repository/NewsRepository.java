package com.NgoPhuongAnh.repository;

import com.NgoPhuongAnh.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    @Query("SELECT n FROM News n WHERE LOWER(n.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<News> findByName(@Param("name") String name);
}

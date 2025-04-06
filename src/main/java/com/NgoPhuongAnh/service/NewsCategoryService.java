package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.NewsCategory;
import com.NgoPhuongAnh.repository.NewsCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsCategoryService {
    @Autowired
    private NewsCategoryRepository newsCategoryRepository;

    public List<NewsCategory> getAllNewsCategories()  {
        return newsCategoryRepository.findAll();
    }

    public Optional<NewsCategory> findNewsCategoryById(Long id) {
        return newsCategoryRepository.findById(id);
    }

    public NewsCategory saveNewsCategory(NewsCategory newsCategory) {
        return newsCategoryRepository.save(newsCategory);
    }

    public NewsCategory updateNewsCategory(Long id, NewsCategory newsCategoryDetails) {
        NewsCategory newsCategory = newsCategoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy danh mục tin tức sự kiện với id: " + id));
        newsCategory.setName(newsCategoryDetails.getName());
        newsCategory.setNotes(newsCategoryDetails.getNotes());
        newsCategory.setIcon(newsCategoryDetails.getIcon());
        newsCategory.setIdParent(newsCategoryDetails.getIdParent());
        newsCategory.setSlug(newsCategoryDetails.getSlug());
        newsCategory.setMetaTitle(newsCategoryDetails.getMetaTitle());
        newsCategory.setMetaKeyword(newsCategoryDetails.getMetaKeyword());
        newsCategory.setMetaDescription(newsCategoryDetails.getMetaDescription());
        newsCategory.setCreatedDate(newsCategoryDetails.getCreatedDate());
        newsCategory.setUpdatedDate(newsCategoryDetails.getUpdatedDate());
        newsCategory.setCreatedBy(newsCategoryDetails.getCreatedBy());
        newsCategory.setUpdatedBy(newsCategoryDetails.getUpdatedBy());
        newsCategory.setIsDelete(newsCategoryDetails.getIsDelete());
        newsCategory.setIsActive(newsCategoryDetails.getIsActive());

        return newsCategoryRepository.save(newsCategory);
    }

    public void deleteNewsCategory(Long id) {
        NewsCategory newsCategory = newsCategoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy danh mục tin tức sự kiện với id: " + id));
        newsCategoryRepository.delete(newsCategory);
    }

    public List<NewsCategory> findNewsCategoryByName(String name) {
        return newsCategoryRepository.findByName(name);
    }
}

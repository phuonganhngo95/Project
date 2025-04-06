package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.Category;
import com.NgoPhuongAnh.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category categoryDetails) {
        Category category = categoryRepository.findById(id).orElseThrow(()->new RuntimeException("Không tìm thấy danh mục với id: " + id));
        category.setName(categoryDetails.getName());
        category.setNotes(categoryDetails.getNotes());
        category.setIcon(categoryDetails.getIcon());
        category.setIdParent(categoryDetails.getIdParent());
        category.setSlug(categoryDetails.getSlug());
        category.setMetaTitle(categoryDetails.getMetaTitle());
        category.setMetaKeyword(categoryDetails.getMetaKeyword());
        category.setMetaDescription(categoryDetails.getMetaDescription());
        category.setCreatedDate(categoryDetails.getCreatedDate());
        category.setUpdatedDate(categoryDetails.getUpdatedDate());
        category.setCreatedBy(categoryDetails.getCreatedBy());
        category.setUpdatedBy(categoryDetails.getUpdatedBy());
        category.setIsDelete(categoryDetails.getIsDelete());
        category.setIsActive(categoryDetails.getIsActive());

        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy danh mục với id: " + id));
        categoryRepository.delete(category);
    }

    public List<Category> findCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }
}

package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.ProductImage;
import com.NgoPhuongAnh.repository.ProductImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImageService {
    @Autowired
    private ProductImagesRepository productImagesRepository;

    public List<ProductImage> getAllProductImages() {
        return productImagesRepository.findAll();
    }

    public Optional<ProductImage> findProductImageById(Long id) {
        return productImagesRepository.findById(id);
    }

    public ProductImage saveProductImage(ProductImage productImage) {
        return productImagesRepository.save(productImage);
    }

    public ProductImage updateProductImage(Long id, ProductImage productImageDetails) {
        ProductImage productImage = productImagesRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy hình ảnh với id: " + id));
        productImage.setName(productImageDetails.getName());
        productImage.setUrlImg(productImageDetails.getUrlImg());
        productImage.setIdProduct(productImageDetails.getIdProduct());

        return productImagesRepository.save(productImage);
    }

    public void deleteProductImage(Long id) {
        ProductImage productImage = productImagesRepository.findById(id).orElseThrow(()->new RuntimeException("Không tìm thấy hình ảnh với id: " + id));
        productImagesRepository.delete(productImage);
    }

    public List<ProductImage> findProductImageByName(String name) {
        return productImagesRepository.findByName(name);
    }
}

package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.Product;
import com.NgoPhuongAnh.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> findProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails) {
        Product product = productRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy sản phẩm với id: " + id));
        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setNotes(productDetails.getNotes());
        product.setImage(productDetails.getImage());
        product.setIdCategory(productDetails.getIdCategory());
        product.setContents(productDetails.getContents());
        product.setPrice(productDetails.getPrice());
        product.setQuantity(productDetails.getQuantity());
        product.setSlug(productDetails.getSlug());
        product.setMetaTitle(productDetails.getMetaTitle());
        product.setMetaKeyword(productDetails.getMetaKeyword());
        product.setMetaDescription(productDetails.getMetaDescription());
        product.setCreatedDate(productDetails.getCreatedDate());
        product.setUpdatedDate(productDetails.getUpdatedDate());
        product.setCreatedBy(productDetails.getCreatedBy());
        product.setUpdatedBy(productDetails.getUpdatedBy());
        product.setIsDelete(productDetails.getIsDelete());
        product.setIsActive(productDetails.getIsActive());

        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy sản phẩm với id: " + id));
        productRepository.delete(product);
    }

    public List<Product> findProductByName(String name) {
        return productRepository.findByName(name);
    }
}

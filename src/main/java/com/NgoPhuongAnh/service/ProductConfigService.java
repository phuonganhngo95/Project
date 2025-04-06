package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.ProductConfig;
import com.NgoPhuongAnh.repository.ProductConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductConfigService {
    @Autowired
    private ProductConfigRepository productConfigRepository;

    public List<ProductConfig> findAllProductConfigs() {
        return productConfigRepository.findAll();
    }

    public ProductConfig saveProductConfig(ProductConfig productConfig) {
        return productConfigRepository.save(productConfig);
    }

    public ProductConfig updateProductConfig(Long id, ProductConfig productConfigDetails) {
        ProductConfig productConfig = productConfigRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy liên kết cấu hình sản phẩm với id: " + id));
        productConfig.setIdProduct(productConfigDetails.getIdProduct());
        productConfig.setIdConfig(productConfigDetails.getIdConfig());
        productConfig.setValue(productConfigDetails.getValue());

        return productConfigRepository.save(productConfig);
    }

    public void deleteProductConfig(Long id) {
        ProductConfig productConfig = productConfigRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy liên kết cấu hình sản phẩm với id: " + id));
        productConfigRepository.delete(productConfig);
    }

    public List<ProductConfig> findProductConfigByProductId(Long productId) {
        return productConfigRepository.findByProductId(productId);
    }
}

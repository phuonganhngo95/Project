package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.Configurations;
import com.NgoPhuongAnh.repository.ConfigurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfigurationsService {
    @Autowired
    private ConfigurationsRepository configurationsRepository;

    public List<Configurations> findAllConfigurations() {
        return configurationsRepository.findAll();
    }

    public Optional<Configurations> findConfigurationsById(Long id) {
        return configurationsRepository.findById(id);
    }

    public Configurations saveConfigurations(Configurations configurations) {
        return configurationsRepository.save(configurations);
    }

    public Configurations updateConfigurations(Long id, Configurations configurationsDetails) {
        Configurations configurations = configurationsRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy cấu hình sản phẩm với id: " + id));
        configurations.setName(configurationsDetails.getName());
        configurations.setNotes(configurationsDetails.getNotes());
        configurations.setIsDelete(configurationsDetails.getIsDelete());
        configurations.setIsActive(configurationsDetails.getIsActive());

        return configurationsRepository.save(configurations);
    }

    public void deleteConfigurations(Long id) {
        Configurations configurations = configurationsRepository.findById(id).orElseThrow(()->new RuntimeException("Không timd thấy cấu hình sản phẩm với id: " + id));
        configurationsRepository.delete(configurations);
    }

    public List<Configurations> findConfigurationsByName(String name) {
        return configurationsRepository.findByName(name);
    }
}

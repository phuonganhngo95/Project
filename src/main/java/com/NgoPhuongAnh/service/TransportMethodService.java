package com.NgoPhuongAnh.service;

import com.NgoPhuongAnh.entity.TransportMethod;
import com.NgoPhuongAnh.repository.TransportMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportMethodService {
    @Autowired
    private TransportMethodRepository transportMethodRepository;

    public List<TransportMethod> getAllTransportMethods() {
        return transportMethodRepository.findAll();
    }

    public Optional<TransportMethod> findTransportMethodById(Long id) {
        return transportMethodRepository.findById(id);
    }

    public TransportMethod saveTransportMethod(TransportMethod transportMethod) {
        return transportMethodRepository.save(transportMethod);
    }

    public TransportMethod updateTransportMethod(Long id, TransportMethod transportMethodDetails) {
        TransportMethod transportMethod = transportMethodRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy phương thức vận chuyển với id: " + id));
        transportMethod.setName(transportMethodDetails.getName());
        transportMethod.setNotes(transportMethodDetails.getNotes());
        transportMethod.setCreatedDate(transportMethodDetails.getCreatedDate());
        transportMethod.setUpdatedDate(transportMethodDetails.getUpdatedDate());
        transportMethod.setIsDelete(transportMethodDetails.getIsDelete());
        transportMethod.setIsActive(transportMethodDetails.getIsActive());

        return transportMethodRepository.save(transportMethod);
    }

    public void deleteTransportMethod(Long id) {
        TransportMethod transportMethod = transportMethodRepository.findById(id).orElseThrow(()-> new RuntimeException("Không tìm thấy phương thức thanh toán với id: " + id));
        transportMethodRepository.delete(transportMethod);
    }

    public List<TransportMethod> findTransportMethodByName(String name) {
        return transportMethodRepository.findByName(name);
    }
}

package com.titanes.titanes.service;

import com.titanes.titanes.model.Enterprise;
import com.titanes.titanes.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseService {
    @Autowired
    EnterpriseRepository enterpriseRepository;

    public void createEnterprise(Enterprise enterprise){
        enterpriseRepository.save(enterprise);
    }
    public List<Enterprise> readEnterprise(){
        List<Enterprise> enterpriseList= new ArrayList<>();
        enterpriseList.addAll(enterpriseRepository.findAll());
        return enterpriseList;
    }
    public void updateEnterprise(Enterprise enterprise){
        enterpriseRepository.save(enterprise);
    }
    public void deleteEnterprise(Long id){
        enterpriseRepository.deleteById(id);
    }

}

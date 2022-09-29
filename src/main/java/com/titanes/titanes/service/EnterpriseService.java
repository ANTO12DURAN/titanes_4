package com.titanes.titanes.service;

import com.titanes.titanes.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService {
    @Autowired
    EnterpriseRepository enterpriseRepository;

    public void createEnterprise(){}
    public void readEnterprise(){}
    public void updateEnterprise(){}
    public void deleteEnterprise(){}

}

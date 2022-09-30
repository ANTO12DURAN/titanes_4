package com.titanes.titanes.controller;

import com.titanes.titanes.model.Enterprise;
import com.titanes.titanes.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterpriseController {

    @Autowired
    EnterpriseService enterpriseService;

    @PostMapping("/enterprise")
    private void createEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.createEnterprise(enterprise);
    }

    @GetMapping("/enterprise")
    private List<Enterprise> readEnterprise(){
        return enterpriseService.readEnterprise();
    }
    @PutMapping("/enterprise")
    private void updateEnterprise(@RequestBody Enterprise enterprise){
        enterpriseService.updateEnterprise(enterprise);
    }
    private void deleteEnterprise(@PathVariable("id") Long id){
        enterpriseService.deleteEnterprise(id);
    }


}

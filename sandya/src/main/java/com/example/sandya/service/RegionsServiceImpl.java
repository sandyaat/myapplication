package com.example.sandya.service;

import com.example.sandya.entity.Regions;
import com.example.sandya.repository.RegionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionsServiceImpl {
    @Autowired
    private RegionsRepository regionsRepo;

    public Regions addRegion(Regions r){
        return regionsRepo.save(r);
    }
    public List<Regions> getAllRegions(){
        return regionsRepo.findAll();
    }
}

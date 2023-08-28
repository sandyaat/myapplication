package com.example.sandya.controller;

import com.example.sandya.entity.Regions;
import com.example.sandya.service.RegionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionsController {
    @Autowired
    RegionsServiceImpl regionsServiceImpl;
    @GetMapping("/getAllRegions")
    public List<Regions> getAllRegions(){
        return regionsServiceImpl.getAllRegions();
    }

}

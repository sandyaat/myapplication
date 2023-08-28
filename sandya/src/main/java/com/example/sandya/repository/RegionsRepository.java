package com.example.sandya.repository;

import com.example.sandya.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionsRepository extends JpaRepository<Regions,Integer>{
}

package com.example.sandya.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="regions")
public class Regions {
    @Id
    @Column(name="region_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regionId;

    private  String name;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continentId;
}

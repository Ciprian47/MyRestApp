package com.app.service;

import com.app.repository.entity.Sighting;
import com.app.repository.SightingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SightingService {

    @Autowired
    SightingRepository sightingRepository;

    public List<Sighting> getAllSightings(){
        return sightingRepository.findAll();
    }




}

package com.app.service;

import com.app.repository.entity.Bird;
import com.app.repository.entity.Sighting;
import com.app.repository.SightingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SightingService {

    @Autowired
    SightingRepository sightingRepository;

    @Autowired
    BirdService birdService;

    public List<Sighting> getAllSightings(){
        return sightingRepository.findAll();
    }

    public List<Sighting> getSightingsByParams(String birdName, String location, String time){
        List<Bird> brdList = birdService.getBirdByName(birdName);
        List<Sighting> retList = new ArrayList<>();
        brdList.forEach(q-> {
            retList.addAll(sightingRepository.findByBirdAndLocationAndDatetime(q, location, time));
        });

        return retList;
    }




}

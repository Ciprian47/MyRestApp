package com.app.service;

//import com.app.repository.BirdRepository;
import com.app.repository.entity.Bird;
import com.app.repository.BirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BirdService {

    @Autowired
    BirdRepository birdRepository;

    public List<Bird> getAllBirds(){
        return birdRepository.findAll();
    }

    public List<Bird> getAllBirdsByCollor(String byCollor){
        return birdRepository.findAllByCollor(byCollor);
    }
    public List<Bird> getAllBirdsByNameAndCollor(String name, String collor){
        return birdRepository.findAllByNameAndCollor(name, collor);
    }

    public List<Bird> getBirdByName(String name){
        return birdRepository.findAllByName(name);
    }

    public void updateAllBirdsNames(String name){
        List<Bird> birdList = birdRepository.findAll();

        for(Bird brd : birdList){
            brd.setName(name);
            birdRepository.save(brd);
        }

    }


}

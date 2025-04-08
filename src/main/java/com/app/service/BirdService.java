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
        List<Bird> birdList = birdRepository.findAll();
       return birdList;
    }

    public List<Bird> getAllBirdsByCollor(String byCollor){
        List<Bird> birdList = birdRepository.findAllByCollor(byCollor);
        return birdList;
    }
    public List<Bird> getAllBirdsByNameAndCollor(String name, String collor){
        List<Bird> birdList = birdRepository.findAllByNameAndCollor(name, collor);
        return birdList;
    }

    public List<Bird> getBirdByName(String name){
        List<Bird> birdList = birdRepository.findAllByName(name);
        return birdList;
    }

    public void updateAllBirdsNames(String name){
        List<Bird> birdList = birdRepository.findAll();

        for(Bird brd : birdList){
            brd.setName(name);
            birdRepository.save(brd);
        }

    }


}

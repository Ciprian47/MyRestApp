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
    public List<Bird> getAllBirdsByWeight(String byCollor){
        List<Bird> birdList = birdRepository.findAllByWeight(byCollor);
        return birdList;
    }


}

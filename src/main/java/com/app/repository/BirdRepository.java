package com.app.repository;

import com.app.repository.entity.Bird;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BirdRepository extends JpaRepository<Bird, String> {

    public List<Bird> findAll();
    public List<Bird> findAllByCollor(String collor);
    public List<Bird> findAllByNameAndCollor(String name, String collor);
    public List<Bird> findAllByName(String Name);

}

package com.app.repository;

import com.app.repository.entity.Sighting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SightingRepository extends JpaRepository<Sighting, String> {

    public List<Sighting> findAll();

}

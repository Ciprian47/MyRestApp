package com.app.controller;

import com.app.repository.entity.Sighting;
import com.app.service.BirdService;
import com.app.repository.entity.Bird;
import com.app.service.SightingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    BirdService birdService;

    @Autowired
    SightingService sightingService;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/birds")
    public String getBirds() {

        StringBuilder sb = new StringBuilder();
        for(Bird brd : birdService.getAllBirds()){
            sb.append("<p>")
                    .append(brd.getId()).append(" ")
                    .append(brd.getName()).append(" ")
                    .append(brd.getCollor()).append(" ")
                    .append(brd.getWeight()).append(" ")
                    .append(brd.getHeight()).append(" ").append("</p>");
        }

        return "Greetings from Spring Boot! " + sb.toString() + " end here from bird";
    }

    @GetMapping("/birds/param")
    public String getBirdsByCollorParam(@RequestParam("name") String name, @RequestParam("collor") String collor) {

        StringBuilder sb = new StringBuilder();
        for(Bird brd : birdService.getAllBirdsByNameAndCollor(name, collor)){
            sb.append("<p>")
                    .append(brd.getId()).append(" ")
                    .append(brd.getName()).append(" ")
                    .append(brd.getCollor()).append(" ")
                    .append(brd.getWeight()).append(" ")
                    .append(brd.getHeight()).append(" ").append("</p>");
        }

        return "Greetings from Spring Boot! " + sb.toString() + " end here from bird param";
    }

    @GetMapping("/birds/pathvar/{byCollor}")
    public String getBirdsByCollor(@PathVariable("byCollor") String byCollor) {

        StringBuilder sb = new StringBuilder();
        for(Bird brd : birdService.getAllBirdsByCollor(byCollor)){
            sb.append("<p>")
                    .append(brd.getId()).append(" ")
                    .append(brd.getName()).append(" ")
                    .append(brd.getCollor()).append(" ")
                    .append(brd.getWeight()).append(" ")
                    .append(brd.getHeight()).append(" ").append("</p>");
        }

        return "Greetings from Spring Boot! " + sb.toString() + " end here from path variable";
    }

    @GetMapping("/sighting")
    public String getSightings() {

        StringBuilder sb = new StringBuilder();
        for(Sighting sighting : sightingService.getAllSightings()){
            sb.append("<p>")
                    .append(sighting.getId()).append(" ")
                    .append(sighting.getBird().getName()).append(" ")
                    .append(sighting.getLocation()).append(" ")
                    .append(sighting.getDatetime()).append(" ").append("</p>");
        }

        return "Greetings from Spring Boot! " + sb.toString() + " end here from sighting";
    }

    @GetMapping("/sighting/param")
    public String getSightingsByParams(@RequestParam("birdName") String birdName, @RequestParam("location") String location,@RequestParam("time") String time) {

        StringBuilder sb = new StringBuilder();
        for(Sighting sighting : sightingService.getSightingsByParams(birdName, location, time)){
            sb.append("<p>")
                    .append(sighting.getId()).append(" ")
                    .append(sighting.getBird().getName()).append(" ")
                    .append(sighting.getLocation()).append(" ")
                    .append(sighting.getDatetime()).append(" ").append("</p>");
        }

        return "Greetings from Spring Boot! " + sb.toString() + " end here from sighting params";
    }

    @GetMapping("/changeall/{birdName}")
    public String getChange(@PathVariable("birdName") String birdName) {

        birdService.updateAllBirdsNames(birdName);

        return "Greetings from Spring Boot! all birds changed to " + birdName + " end here from changeall";
    }

}

package com.testJava.recruitment.Controller;

import java.util.*;

import com.testJava.recruitment.DAO.ActorDAO;
import com.testJava.recruitment.Model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")

public class MainController {

    private ActorDAO actorDAO;

    @Autowired
    public MainController(ActorDAO actorDAO) {
        this.actorDAO = actorDAO;
    }

    @GetMapping(path = "/actors")
    public ResponseEntity<List<Actor>> getActors() {
        List<Actor> allActors = actorDAO.findAll();
        return new ResponseEntity<>(allActors, HttpStatus.OK);
    }

    @GetMapping(path = "/actors/{id}")
    public ResponseEntity<Actor> getActor(@PathVariable("id") Long id) {
        Optional<Actor> optActor = actorDAO.findById(id);
        if (optActor.isPresent()) {
            Actor actor = optActor.get();
            return new ResponseEntity<>(actor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
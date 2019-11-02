package com.testJava.recruitment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")

public class MainController {

    @Autowired
    public MainController() {
    }

    @GetMapping(path = "/actors")
    public ResponseEntity<String> getActors() {
        // List<Actor> allActors = ActorDAO.getActors();
        return new ResponseEntity<>("response", HttpStatus.OK);
    }

    // @GetMapping(path = "/actors/{id}")
    // public ResponseEntity<> postWord(@PathVariable("id") Long id) {
    //     Actor actor = ActorDAO.getActorById();
    //     return new ResponseEntity<>(actor, HttpStatus.OK);
    // }

    // @GetMapping(path = "/actors/{id}/appearances")
    // public ResponseEntity<> drawLetters(@PathVariable("id") Long id) {
    //     // get apperances of an actor
    //     return new ResponseEntity<>(response, HttpStatus.OK);
    // }
}
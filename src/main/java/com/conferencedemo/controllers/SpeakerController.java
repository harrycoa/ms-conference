package com.conferencedemo.controllers;

import com.conferencedemo.models.Session;
import com.conferencedemo.models.Speaker;
import com.conferencedemo.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakerController {

    @Autowired
    private SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> list(){
        return speakerRepository.findAll();
    }

    @GetMapping
    @RequestMapping("id")
    public Speaker get(@PathVariable Long  id){
        return speakerRepository.getOne(id);
    }

    @PostMapping
    public Speaker create(@RequestBody final Speaker speaker){
        return speakerRepository.saveAndFlush(speaker);
    }

    @GetMapping
    public Optional<Speaker> findById(Long id){
        return speakerRepository.findById(id);
    }


}

package com.example.fedebackend.controller;

import com.example.fedebackend.model.patient;
import com.example.fedebackend.repositories.patientrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class controller {

    @Autowired
    private patientrep rep ;
    @GetMapping("/api/patients")
    @ResponseBody
    public ResponseEntity<?> getAllpaient(){
      

         return ResponseEntity.ok(rep.findAll());
    }




}

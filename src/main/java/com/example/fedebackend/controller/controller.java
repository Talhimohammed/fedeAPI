package com.example.fedebackend.controller;

import com.example.fedebackend.model.patient;
import com.example.fedebackend.repositories.patientrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("/api/stat")
    @ResponseBody
    public ResponseEntity<?> stati(){
        Map<Integer,Integer> result = new HashMap<Integer, Integer>() ;
        result.put(1,0);
        result.put(0,0);
        rep.findAll().forEach( patient -> {
              if( patient.getSex() == 1 && patient.getTarget() == 1) {
                  result.put(1,result.get(1)+1);
              }
            if( patient.getSex() == 0 && patient.getTarget() == 1) {
                result.put(0,result.get(0)+1);
            }
        });
        return ResponseEntity.ok(result);
    }






}

package com.microservice.celulares.controllers;

//import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.celulares.entity.Celular;

import com.microservice.celulares.service.CelularService;



@RestController
public class CelularController {

    @Autowired
    private CelularService service;
    
    @GetMapping("/list")
    public List<Celular> list(){
        return service.findAll();
    }

    @DeleteMapping("/celular/{id}")
    public ResponseEntity<Void> drop(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/celular")
    public ResponseEntity<Celular> add(@RequestBody Celular instance){
        Celular cel = service.save(instance);
        return new ResponseEntity<>(cel, HttpStatus.CREATED);
    }

    @PutMapping("/celular/{id}")
    public ResponseEntity<Celular> update(@PathVariable Long id, @RequestBody Celular instance) {
        
        if(service.existsById(id)){
            instance.setID(id);
            Celular cel = service.save(instance);
            return new ResponseEntity<>(cel, HttpStatus.OK);    
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
        }
        
    }
    


    
}

package com.store.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;

import com.store.models.Store;
import com.store.services.StoreService;


@RestController
public class StoreController{

    @Autowired
    private StoreService storeService;
    @GetMapping("/list")
    public List<Store> list() {
        return storeService.findAll();
    }

    @GetMapping("/celular/{id}/cantidad/{cantidad}")
    public Store details(@PathVariable Long id, @PathVariable Integer cantidad) {
        return storeService.findById(id, cantidad);
    }
    
    
}

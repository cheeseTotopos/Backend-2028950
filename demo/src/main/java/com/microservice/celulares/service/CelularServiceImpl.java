package com.microservice.celulares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.celulares.entity.Celular;
import com.microservice.celulares.repository.CelularDao;
//import com.microservice.celulares.service.CelularService;


import org.springframework.stereotype.Service;

@Service
public class CelularServiceImpl implements CelularService{


    @Autowired
    private CelularDao celularDao;


    @Override
    public List<Celular> findAll(){
        return (List<Celular>) celularDao.findAll();
    }

    @Override
    public Celular findById(Long id){
        return celularDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id){
        celularDao.deleteById(id);
    }

    @Override
    public Celular save(Celular instance){
        return celularDao.save(instance);
    }

    @Override
    public boolean existsById(Long id){
        return celularDao.existsById(id);
    }   

}

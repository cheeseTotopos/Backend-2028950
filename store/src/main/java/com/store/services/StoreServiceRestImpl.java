package com.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import java.util.stream.Collectors;
import org.springframework.web.client.RestTemplate;
//import com.store.services.StoreService;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import com.store.models.Store;
import com.store.models.Celular;
import org.springframework.stereotype.Service;

@Service("serviceRest")
@Primary
public class StoreServiceRestImpl implements StoreService{

    @Autowired
    private RestTemplate clientRest;

    @Override
    public List<Store> findAll(){
        List<Celular> celulares = Arrays.asList(clientRest.getForObject("https://localhost:8081/list", Celular[].class));
        return celulares.stream().map(c-> new Store(c, 5)).collect(Collectors.toList());
    }

    @Override
    public Store findById(Long id, Integer cantidad){
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("id", id.toString());
        Celular cel = clientRest.getForObject("https://localhost:8081/celular/{id}", Celular.class, pathVariables);
        return new Store(cel, cantidad);
    }
}



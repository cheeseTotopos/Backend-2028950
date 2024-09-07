package com.store.services;


import java.util.List;
import com.store.models.Store;


public interface StoreService {

    public List<Store> findAll();

    public Store findById(Long id, Integer cantidad);
}

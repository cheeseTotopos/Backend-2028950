package com.store.models;
import java.util.Date;

public class Celular {

    private Long id;
    private String name;
    private String marca;
    private Date createdAt;


    public void setID(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public void createdAt(Date createdAt){
        this.createdAt=createdAt;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getMarca(){
        return marca;
    }

    public Date getCreatedAt(){
        return createdAt;
    }
}

package com.microservice.celulares.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Column;


@Entity
@Table(name = "celulares")
public class Celular implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 8550556477721078417L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String marca;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    public Long getID(){
        return id;
    }

    public void setID(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public Date getCreateAt(){
        return createAt;
    }

    public void setCreateAt(Date createAt){
        this.createAt = createAt;
    }
}

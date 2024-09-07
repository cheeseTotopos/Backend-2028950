package com.store.models;

public class Store {

    private Celular cel;
    private Integer cantidad;
    public Store(){}

    public Store(Celular cel, Integer cantidad){
        super();
        this.cel =cel;
        this.cantidad=cantidad;
    }

    public void setCel(Celular cel){
        this.cel=cel;
    }

    public void setCantidad(Integer cantidad){
        this.cantidad=cantidad;
    }

    public Celular getCel(){
        return cel;
    }

    public Integer getCantidad(){
        return cantidad;
    }
}

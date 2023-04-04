package com.minimo1prueba;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int identificador =0;
    private String username;

    List<String> listaprecio=new ArrayList<String>();
    //List<Product> numventas=new ArrayList<Product>();

    public Order(String s){
        this.username=username;
    }
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
    public int getIdentificador(){
        return identificador;
    }
    public void setusername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;

    }
    public void AddProduct(String producto){

        listaprecio.add(producto);
    }
    public List<String> getProductNames() {
        return listaprecio;
    }
    public void setProductNames(List<String> names) {
        this.listaprecio = listaprecio;
    }

    public void AddProduct() {
    }
}

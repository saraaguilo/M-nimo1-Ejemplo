package com.minimo1prueba;

public class Product {
    public Object getPrice;
    private String nameProduct;
    private double price;
    private int sales=0;

    public Product(String nameProduct, double price){
        this.nameProduct=nameProduct;
        this.price=price;

    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public String GetName(){
        return this.nameProduct;
    }
    public void AddSale(){
        sales=sales++;
    }
    public void setSales(int sales) { this.sales = sales; }
    public int getSales(){
        return sales;
    }
    public void addProduct(String name, String price){

    }



}

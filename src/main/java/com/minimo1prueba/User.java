package com.minimo1prueba;
import java.util.ArrayList;
import java.util.List;
public class User {
    private String userId;
    private List<Order> listOrders =new ArrayList<Order>();
    private List<Order> listOrdersdone= new ArrayList<Order>();

    public User(String userId){
        this.userId=userId;
    }
    public void AddProductnotDone(Order order){
        listOrders.add(order);
    }
    public void AddProductoDone(Order order){
        listOrdersdone.add(order);
    }

    public List<Order> getListOrders() {return listOrders; }
    public List<Order> getListOrdersdone() {return listOrdersdone; }
    public void setListOrders() {this.listOrders=listOrders; }
    public void setListOrdersdone() {this.listOrdersdone=listOrdersdone; }

    public void setUserId(String userId){
        this.userId=userId;
    }
    public String getUserId(){
        return userId;
    }
    public void addOrder(Order order){
        listOrders.add(order);
    }
    public void addOrdersdone(Order order){
        listOrdersdone.add(order);
    }


}

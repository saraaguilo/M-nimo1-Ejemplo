package com.minimo1prueba;
import java.util.List;

//deberemos crear una cola
public interface ProductManager {


    //void addUser(String dfgdfg, String cafe, double v);

    //void addUser(String dfgdfg, String cafe, double v);

    void addUser(int userID, String name, String surname);

    void addProduct(String producto, double price);

    public List<Product> getProductPrize();
    public List<Product> listaporVentas();
    public void nuevaOrder(Order order);
    public List<Order> getPedidosRealizados(String userId);
    public void clear(Order p, User user);
    public Product getProduct(String nameProduct);
    public User getUser(String userId);
    public Order processOrder();
    int numUser();
    int numProduct();
    int numProducts();
    int numOrders();


    //void addProduct(String dfgdfg, String cacaolat, int i);
}

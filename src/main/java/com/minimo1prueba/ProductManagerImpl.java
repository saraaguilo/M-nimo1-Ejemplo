package com.minimo1prueba;


import java.util.*;
public class ProductManagerImpl implements ProductManager {

    List<Product> listProduct = new ArrayList<>();

    private Queue<Order> colaPedidos = new LinkedList<>();
    //private List<Product> listamasVendidos = new ArrayList<>();
    private List<Order> listayaRealizados = new ArrayList<>();
    private  HashMap<String, User> hmUsers = new HashMap<String,User>();
    //private int cont=0;

    private static ProductManager instance;

    private ProductManagerImpl (){

    }

    public void addProduct(Product producto){
        listProduct.add(producto);
    }
    public void addPedido(Order order){
        colaPedidos.add(order);
    }
    public void addUser(User user){
        hmUsers.put(user.getUserId(), user);
    }
    public User getUser(String userId){
        return hmUsers.get(userId);
    }
    public Product getProduct(String nameProduct){
        return null;
    }
    public void clear(Order p, User user){
        int i;
        for (i=0;i<colaPedidos.size();i++){
            colaPedidos.remove(p);
            hmUsers.clear();
            listayaRealizados.add(p);
        }
    }
    public static ProductManager getInstance() {
        if (instance==null) instance = new ProductManagerImpl();

        return instance;
    }
    public static void setInstance(ProductManagerImpl instance){
        ProductManagerImpl.instance=instance;
    }

    @Override
    public void addUser(int userID, String name, String surname) {

    }

    @Override
    public void addProduct(String producto, double price) {

    }

    public List<Product> getProductPrize(){
        List<Product> listaprecio=listProduct;
        Collections.sort(listaprecio, new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());

            }
        });
        return listaprecio;


    }
    public List<Order> getPedidosRealizados(String userId){

        return hmUsers.get(userId).getListOrdersdone();

    }
    public void nuevaOrder(Order order){
        User user;
        user=hmUsers.get(order.getUsername());
        if (user==null){
            System.out.println("El usuario " + user+ " no existe");
        }
        else{
            user.addOrder(order);
            colaPedidos.add(order);
            int identificador=0;
            order.setIdentificador(identificador);
            identificador++;

        }
    }

    public List<Product> listaporVentas(){
        List<Product> listaVentas=listProduct;
        Collections.sort(listaVentas, new Comparator<Product>(){


            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getSales(), o2.getSales());
            }
        });


        return listaVentas;
    }

    public Order processOrder(){
        Order o= colaPedidos.remove();
        User user= hmUsers.get(o.getUsername());
        user.addOrdersdone(o);

        List<String> p=o.getProductNames();
        for (int i=0;i<p.size();i++){
            for (int j=0;j<listProduct.size();j++){
                if (p.get(i) == listProduct.get(j).GetName())
                    listProduct.get(j).AddSale();
            }
        }
        return (Order) o;



    }

    @Override
    public int numUser() {
        return 0;
    }

    @Override
    public int numProduct() {
        return 0;
    }

    @Override
    public int numProducts() {
        return 0;
    }

    @Override
    public int numOrders() {
        return 0;
    }


}
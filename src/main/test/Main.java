import com.minimo1prueba.Order;
import com.minimo1prueba.Product;
import com.minimo1prueba.ProductManager;
import com.minimo1prueba.ProductManagerImpl;
import com.minimo1prueba.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    private ProductManager pm;
        List<Product> listproduct;






        @Before
        public void setUp() {
            //inicialización de variables
            pm= ProductManagerImpl.getInstance();
            pm.addProduct("bocata", 25.0);
            pm.addProduct("cafe", 2.25);
            pm.addProduct("croissant", 5.0);


            pm.addUser(125, "Sara", "Pons");
            pm.addUser(456, "Marc", "Castell");
            pm.addUser(678, "Marina", "Fernandez");

            Order order=new Order("1");
            pm.nuevaOrder(order);

        }

       @After
        public void tearDown(){
            pm=null;
        }

        @Test
        public void nuevaOrder() {
            Order o1 = new Order("1");
            o1.AddProduct("bocata");
            pm.nuevaOrder(o1);

            Order o2 = new Order("2");
            o2.AddProduct("cafe");
            pm.nuevaOrder(o2);

            Order o3 = new Order("3");
            o3.AddProduct("croissant");
            pm.nuevaOrder(o3);
        }
            public void getProductPrizetest(){
                List<Product> listPrize=pm.getProductPrize(); //this perque es teardown

                Assert.assertEquals("bocata", listPrize.get(0).GetName());
                Assert.assertEquals("cafe", listPrize.get(1).GetName());
                Assert.assertEquals("croissant", listPrize.get(2).GetName());

            }
            public void listaporVentastest(){
                List<Product> listVentas=pm.listaporVentas(); //this perque es teardown

                Assert.assertEquals("bocata", listVentas.get(0).GetName());
                Assert.assertEquals("cafe", listVentas.get(1).GetName());
                Assert.assertEquals("croissant", listVentas.get(2).GetName());

            }
            public void processOrdertest(){
                Assert.assertEquals(3, pm.numUser());
                Assert.assertEquals(3, pm.numProducts());
                Assert.assertEquals(3, pm.numOrders());
            }




}
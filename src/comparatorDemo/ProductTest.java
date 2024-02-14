package comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTest {

    public static void main(String[] args) {


        Product p1 = new Product(1, "Iphone", 55000);
        Product p2 = new Product(2, "MacBook", 100000);
        Product p3 = new Product(3, "IWatch", 50000);

        List<Product> productList = new ArrayList<>();


        productList.add(p2);
        productList.add(p3);
        productList.add(p1);

        for (Product product: productList) {
            System.out.println(product);
        }

        System.out.println("--------------------------------------");

        Collections.sort(productList, new Product());

        for (Product product: productList) {
            System.out.println(product);
        }



    }
}

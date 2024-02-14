package comparatorDemo;

import java.util.Comparator;

public class Product implements Comparator<Product> {
     private int id;
     private String productName;
     private double price;

    public Product(int id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compare(Product product1, Product product2) {

        double price1 = product1.getPrice();
        double price2= product2.getPrice();

        if(price1 < price2)
            return -1; //do nothing
        else if(price1 > price2)
            return 1;    //swap the objects
        else
            return 0;
    }
}

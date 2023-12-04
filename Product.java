package CS102_PROJECT;

import java.io.FileNotFoundException;
import java.util.*;

public class Product implements Discountable, Comparable<Product>, iProduct {

    private String name;
    private double price;
    private int inventoryLevel;
    private static int numProducts;

    public Product(String name, double price, int inventoryLevel) {
         this.name = name;
        this.price = price;
        this.inventoryLevel = inventoryLevel;
        numProducts++;
    }

   

  

    // Method to calculate discount
    @Override
    public double calculateDiscount(double discountRate) {
        return this.price - (this.price * discountRate);
    }

    // Method to compare products
    @Override
    public int compareTo(Product o) {
        if (o == null) {
            return 1;
        }
        return Double.compare(this.price, o.price);
    }

    // Method to get the number of products
    public static int getNumProducts() {
        return numProducts;
    }

    // Method to decrease the number of products
    public static void decreaseNumProducts() {
        numProducts--;
    }

    // Method to set the price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to get the inventory level
    public int getInventoryLevel() {
        return inventoryLevel;
    }

    // Method to set the inventory level
    public void setInventoryLevel(int inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    // Method to get the price
    public double getPrice() {
        return price;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to check equality of products

 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
 

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to convert product details to a string
   
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", inventoryLevel=" + inventoryLevel + '}';
    }
}



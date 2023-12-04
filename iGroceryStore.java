
package CS102_PROJECT;

import java.io.FileNotFoundException;


public interface iGroceryStore {
    public abstract void getInvenFromFile(String fileName) throws FileNotFoundException;
     public abstract boolean StepsOfSale();
     public abstract boolean KeepInventoryUpToDate()throws FileNotFoundException;
     public abstract void printInStoreProducts();
       public abstract Product findProduct(String name) ;
       public abstract void addProduct(Product p);
        public abstract void removeProduct(String name);
        public abstract Cart addToCart(Cart shoppingCart, Product item);
        public abstract void checkout(Cart shoppingCart);
         public abstract void updateInventoryLevel(Product item, int quantity);
         public abstract void updateInventoryFromFile()throws FileNotFoundException;
         public abstract void addNewProductToInventory() throws FileNotFoundException;
         public abstract void writeInventoryToFile(String fileName)throws FileNotFoundException;
         
}

package CS102_PROJECT;


public class Cart implements iCart{

    private Product[] items;
    private int[] quantities;
    private int size;

    public Cart() {
        this.items = new Product[25];
        this.quantities = new int[25];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setItems(Product[] items) {
        this.items = items;
    }

    public Product[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        String result = String.format("%20S\n", "CART ITEMS");
        result += String.format("%-15s%-10s%-10s\n\n", "Product Name", "Price", "Quantity");
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                continue;
            }
            result += String.format("%-15S%5.2f%10d\n", items[i].getName(), items[i].getPrice(), quantities[i]);
        }
        return result;
    }

    public void setQuantities(int[] quantities) {
        this.quantities = quantities;
    }

    public int[] getQuantities() {
        return quantities;
    }

    @Override
    public boolean hasItems(Product item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null){
                continue;
            }
            if (items[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void discardItem(Product item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                this.items[i] = null;
                this.quantities[i] = 0;
                this.size--;
                break;
            }
        }
    }

    @Override
    public void newItem(Product item, int Quant) {
        if (this.size == this.items.length) {
            Product[] newItems = new Product[this.size * 2];
            int[] newQuantities = new int[this.size * 2];

            for (int i = 0; i < this.items.length; i++) {
                newItems[i] = this.items[i];
                newQuantities[i] = this.quantities[i];
            }

            newItems[size] = item;
            newQuantities[size] = Quant;

            this.items = newItems;
            this.quantities = newQuantities;

            this.size++;

        } else {
            this.items[size] = item;
            this.quantities[size] = Quant;
            this.size++;
        }
    }
}


package CS102_PROJECT;


public class Sale implements Comparable<Sale>, iSale {

    private String customerName;
    private Cart cart;
    private double salePrice;
    private double discountRate;
    private static int numSales;

    public Sale(String customerName, Cart cart, double discountRate) {
        this.customerName = customerName;
        this.cart = cart;
        setDiscountRate(discountRate);
        this.salePrice = calculateSale();
        numSales++;
    }

    public double calculateSale() {
        double totalPrice = 0;

        for (int i = 0; i < this.cart.getItems().length; i++) {
            if (cart.getItems()[i] == null) {
                continue;
            }
            double price = cart.getItems()[i].calculateDiscount(discountRate);
            int quantity = cart.getQuantities()[i];
            totalPrice += price * quantity;
        }
        return totalPrice;

    }

    @Override
    public int compareTo(Sale o) {
        if (o == null) {
            return 1;
        }
        return Double.compare(salePrice, o.salePrice);
    }

    public static int getNumSales() {
        return numSales;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }
    
    @Override
    public void setDiscountRate(double discountRate) {
        discountRate = discountRate / 100;
        if (discountRate < 0 || discountRate > 1) {
            throw new IllegalArgumentException("Discount Rate cannot be negative or more than 100%!");
        }
        this.discountRate = discountRate;
    }


   @Override
    public String toString() {
    StringBuilder result = new StringBuilder();
    
    result.append("\n✨✨ Faisal's Market - Your Receipt of Magical Savings! ✨✨\n");
    result.append("----------------------------------------------------------\n");
    
    result.append("Honored Guest (Mr/Ms): ").append(this.customerName).append(" \n\n");

    result.append("Treasures in Your Cart \n");
    result.append(this.cart); 
    result.append("\n----------------------------------------------------------\n");

    result.append(String.format("Total Enchanted Price: %.2f SAR \n", this.salePrice));
    result.append(String.format(" Discount Granted by Fairies: %.0f%% \n", (this.discountRate * 100)));
    
    result.append(" Thank you for bringing your magic to Faisal's Market! ?\n");
    result.append("----------------------------------------------------------\n");
    result.append(" May your day be as splendid as your shopping! \n");
    result.append("<<<<<<<<End of Transaction>>>>>>>>>>>>>>>>");

    return result.toString();
}

 


}





 




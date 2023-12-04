
package CS102_PROJECT;


public interface iCart {
    public abstract void discardItem(Product item);
    public abstract boolean hasItems(Product item);
     public abstract void newItem(Product item, int Quant);
}

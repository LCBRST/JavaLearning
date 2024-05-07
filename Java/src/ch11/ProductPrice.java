package ch11;

public class ProductPrice<T> {
    private T price;
    private T discount;
    
    public T getPrice() {
        return price;
    }
    public void setPrice(T price) {
        this.price = price;
    }
    public T getDiscount() {
        return discount;
    }
    public void setDiscount(T discount) {
        this.discount = discount;
    }
    
}

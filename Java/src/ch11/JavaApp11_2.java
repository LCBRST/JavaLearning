package ch11;

public class JavaApp11_2 {
    public static void main(String[] args) {
        ProductPrice<Float> p1=new ProductPrice<Float>();
        p1.setPrice(100f);
        p1.setDiscount(0.5f);
        ProductPrice<String> p2=new ProductPrice<String>();
        p2.setPrice("伍伯块");
        p2.setDiscount("骨折"); 
    }
}

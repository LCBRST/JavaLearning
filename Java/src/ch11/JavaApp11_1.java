package ch11;

public class JavaApp11_1 {
    public static void main(String[] args) {
        //创建一个商品实例p1，价格和折扣为float
        ProductPrice_Float p1=new ProductPrice_Float();
        p1.setPrice(100);
        p1.setDiscount(0.5f);
        System.out.println("p1的价格是:"+p1.getPrice());
        System.out.println("p1的折扣是:"+p1.getDiscount());
        //创建一个商品实例p2，价格和折扣为String
        ProductPrice_String p2=new ProductPrice_String();
        p2.setPrice("一伯块");
        p2.setDiscount("五折");
        System.out.println("p1的价格是:"+p2.getPrice());
        System.out.println("p1的折扣是:"+p2.getDiscount());
    }
}

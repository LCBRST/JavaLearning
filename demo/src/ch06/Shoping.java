package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//商品类
class Product {
 String name;
 double price;

 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }
}

//购物车类（购物清单类）
class ShoppingCart {
 List<Product> productList;
 double totalPrice;

 public ShoppingCart() {
     this.productList = new ArrayList<>();
     this.totalPrice = 0.0;
 }

 public void addProduct(Product product) {
     productList.add(product);
     totalPrice += product.price;
     System.out.println(product.name + " 已添加到购物车");
 }

 public void calculateTotalPrice() {
     System.out.println("购物清单：");
     for (Product product : productList) {
         System.out.println(product.name + " - ￥" + product.price);
     }
     System.out.println("总价：￥" + totalPrice);
 }
}

//主程序
public class Shoping {
 public static void main(String[] args) {
     ShoppingCart cart = new ShoppingCart();
     try (Scanner sc = new Scanner(System.in)) {
        String pd,name;
         double price;
         pd=sc.nextLine();
         String[] strs=pd.split(" ");
         name=strs[0];
         price=Double.parseDouble(strs[1]);
         Product apple = new Product("苹果", 5.0);
         Product banana = new Product("香蕉", 3.0);
         Product shoes =new Product("单鞋",100);
         Product product =new Product(name, price);

         cart.addProduct(apple);
         cart.addProduct(banana);
         cart.addProduct(shoes);
         cart.addProduct(product);
    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
     cart.calculateTotalPrice();
 }
}
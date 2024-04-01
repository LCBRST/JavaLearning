package ch06;

import java.util.ArrayList;
import java.util.List;

//商品类
class Product {
 private String name;
 private double price;
 private String color;

 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }
 public Product(String name){
     this.name=name;
 }
 public Product(){
    
 }
 public Product(String name,String color){
    this.name=name;
    this.color=color;
 }
 public Product(String name,String color,double price){
    this.name=name;
    this.color=color;
    this.price=price;
 }
//  接口区
 public String getName(){
    return name;
 }
 public double getPrice(){
    return price;
 }
 public String getColor(){
    return color;
 }
 public void setProduct(String name){
    this.name=name;
 }
 public void setProduct(double price){
    this.price=price;    
 }
 public void setProduct(String name,double price){
    this.name=name;
    this.price=price;
 }
 public void setProduct(String name,String color){   
    this.color=color;
 }
 public void setProduct(String name,String color,double price){
    this.name=name;
    this.color=color;
    this.price=price;
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
     totalPrice += product.getPrice();
     System.out.println(product.getColor() + product.getName() + " 已添加到购物车");
 }

 public void calculateTotalPrice() {
     System.out.println("购物清单：");
     for (Product product : productList) {
         System.out.println(product.getColor() + product.getName() + " - ￥" + product.getPrice());
     }
     System.out.println("总价：￥" + totalPrice);
 }
}

//主程序
public class Shoping {
 public static void main(String[] args) {
     ShoppingCart cart = new ShoppingCart();
         
         Product apple = new Product("苹果","红", 5.0);
         Product banana = new Product("香蕉","黄", 3.0);
         Product shoes =new Product("单鞋","黑",100);
         Product phone=new Product("HUAWEI Nova 11SE","五彩斑斓的黑 ",3999);


         cart.addProduct(apple);
         cart.addProduct(banana);
         cart.addProduct(shoes);
         cart.addProduct(phone);

        //  apple 20%OFF
        //  apple.setProduct(4.0);
        //  apple.setProduct("苹果","红");
         cart.addProduct(apple);
     cart.calculateTotalPrice();
 }
}
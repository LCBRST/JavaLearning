package ch07;

public class Vehicle {//父类
    //公有属性
    private String brand; // 品牌
    private int maxSpeed; // 最高速度
    // 构造方法
    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Mark(with 2 parameter)");
    }
    // 交通工具公有的方法
    public void startEngine() { //启动发动机
        System.out.println("The engine of the " + brand + " has started.");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // 其他通用方法可以在这里添加
    // 喇叭
    public void honk(){
        System.out.println("叭叭叭");
    }
}

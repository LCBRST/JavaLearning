package ch07.vehicle;

public class Car extends Vehicle {//创建交通工具的子类
    private int numberOfSeats; // 座位数

    public Car(String make, int maxSpeed, int numberOfSeats) {
        super(make, maxSpeed);//调用父类构造方法的语句必须在该方法的第一行
        this.numberOfSeats = numberOfSeats;
        System.out.println("Car Mark(with 3 parameter)");
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // 汽车特有的方法或属性可以在这里添加
    // public void honk() { //按喇叭
    //     System.out.println("The car is honking!");
    // }
    public void openDoor(){
        System.out.println(super.getBrand()+"车门打开");
    }
    public void countCarDoor(){
        System.out.println("四扇门儿");
    }
}

package ch06;

//基类 Vehicle(交通工具)
class Vehicle {
    private String brand; // 品牌
    private int maxSpeed; // 最高速度

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void startEngine() { //启动发动机
        System.out.println("The engine of the " + brand + " has started.");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // 其他通用方法可以在这里添加
}

//派生类 Car
class Car extends Vehicle {
    private int numberOfSeats; // 座位数

    public Car(String make, int maxSpeed, int numberOfSeats) {
        super(make, maxSpeed);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // 汽车特有的方法或属性可以在这里添加
    public void honk() { //按喇叭
        System.out.println("The car is honking!");
    }

}

//派生类 Bike
class Bike extends Vehicle {
    private boolean hasGears; // 是否有齿轮

    public Bike(String make, int maxSpeed, boolean hasGears) {
        super(make, maxSpeed);
        this.hasGears = hasGears;
    }

    public boolean hasGears() {
        return hasGears;
    }

    // 自行车特有的方法或属性可以在这里添加(换挡或刹车)
}

//派生类 Bus
class Bus extends Vehicle {
    private int capacity; // 载客量

    public Bus(String make, int maxSpeed, int capacity) {
        super(make, maxSpeed);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    // 公交车特有的方法或属性可以在这里添加
}

//主类，用于演示继承和功能
public class TransportInheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 5);
        Bike bike = new Bike("Trek", 30, true);
        Bus bus = new Bus("Benz", 120, 50);

        car.startEngine();
        bike.startEngine();
        bus.startEngine();

        System.out.println("Car max speed: " + car.getMaxSpeed() + " km/h");
        System.out.println("Bike has gears: " + bike.hasGears());
        System.out.println("Bus capacity: " + bus.getCapacity() + " passengers");
    }
}

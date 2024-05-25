package otherSrc.homeWork;

import java.util.Scanner;

public class Vehicle {
    protected int wheelCount;
    protected double weight;

    public Vehicle(int wheelCount, double weight) {
        this.wheelCount = wheelCount;
        this.weight = weight;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public double getWeight() {
        return weight;
    }

    // 计算总重的方法，可以被子类重写
    public double calculateTotalWeight() {
        return weight;
    }
}
class Car extends Vehicle {
    private int passengerCount;
    private static final double PASSENGER_WEIGHT = 60.0; // 假设每个人的重量都是60kg

    public Car(int wheelCount, double weight, int passengerCount) {
        super(wheelCount, weight);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public double calculateTotalWeight() {
        // 计算小车的总重，包括司机和乘客的重量
        return weight + passengerCount * PASSENGER_WEIGHT;
    }

    @Override
    public String toString() {
        return String.format("%d轮小车，共载%d人，总重%.2fkg", wheelCount, passengerCount, calculateTotalWeight());
    }
}
class Truck extends Vehicle {
    private double cargoWeight;
    private int passengerCount;
    private static final double PASSENGER_WEIGHT = 60.0; // 假设每个人的重量都是60kg

    public Truck(int wheelCount, double weight, double cargoWeight, int passengerCount) {
        super(wheelCount, weight);
        this.cargoWeight = cargoWeight;
        this.passengerCount = passengerCount;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public double calculateTotalWeight() {
        // 计算货车的总重，包括司机、乘客和货物的重量
        return weight + passengerCount * PASSENGER_WEIGHT + cargoWeight;
    }

    @Override
    public String toString() {
        return String.format("%d轮货车，共载%d人，载货%.2fkg，总重%.2fkg", wheelCount, passengerCount, cargoWeight, calculateTotalWeight());
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入车辆信息（格式：轮胎数 净车重 载人数/载货量 车类型）：");
        int wheelCount = scanner.nextInt();
        double weight = scanner.nextDouble();
        scanner.nextLine(); // 读取换行符
        String type = scanner.nextLine();

        Vehicle vehicle;
        if (type.equals("小车")) {
            int passengerCount = scanner.nextInt();
            vehicle = new Car(wheelCount, weight, passengerCount);
        } else {
            double cargoWeight = scanner.nextDouble();
            int passengerCount = scanner.nextInt();
            vehicle = new Truck(wheelCount, weight, cargoWeight, passengerCount);
        }

        System.out.println(vehicle);
        scanner.close();
    }
}
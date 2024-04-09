package ch07;

public class Bus extends Vehicle {
    private int capacity; // 载客量

    public Bus(String make, int maxSpeed, int capacity) {
        super(make, maxSpeed);
        this.capacity = capacity;
        System.out.println("Bus Mark(with 3 parameter)");
    }

    public int getCapacity() {
        return capacity;
    }

    // 公交车特有的方法或属性可以在这里添加
}

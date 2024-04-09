package ch07;

public class Bike extends Vehicle{
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

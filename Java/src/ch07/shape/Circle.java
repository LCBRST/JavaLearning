package ch07.shape;

public class Circle {
    private final double PI=3.14;
    private double radius;
    public Circle (double r){
        this.radius=r;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getLength(){
        return 2*PI*radius;
    }
}

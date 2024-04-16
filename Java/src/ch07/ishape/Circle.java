package ch07.ishape;

public class Circle implements IShape{
    private double r;
    public Circle(double r){
        this.r=r;
    }
    public double getArea(){
        return PI*r*r;
    }
    public double getLength(){
        return 2*PI*r;
    }
}

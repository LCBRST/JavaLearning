package ch07.ishape;

public class Rectangle implements IShape{
    private double length,width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double getArea(){
        return length*width;
    }
    public double getLength(){
        return 2*(length+width);
    }
    
}

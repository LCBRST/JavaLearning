package ch07.shape;

public class Rectangle {
    private double lengeth,wideth;
    public Rectangle(double lengeth,double wideth){
        this.lengeth=lengeth;
        this.wideth=wideth;
    }
    public double getArea(){
        return wideth*lengeth;
    }
    public double getLength(){
        return 2*(lengeth+wideth);
    }
}

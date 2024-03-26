package ch06;

public class Trangle {
    private double a,b,c;
    public boolean isTrangle(){
        if(a+b>c&&a+c>b&&b+c>a){
            return true;
        }
        else{
            return false;
        }
    public double getArea(){
        double d=getLength();
        return Math.sqrt(double d*(d-a)*(d-b)*(d-c)));
    }
    public double getLength(){
        return a+b+c;
    }
    }
}

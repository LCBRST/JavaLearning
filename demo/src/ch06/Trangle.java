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
    }
        double getArea(){
        double d=getLength();
        return Math.sqrt(d*(d-a)*(d-b)*(d-c));
    }
    double getLength(){
        return a+b+c;
    }
}

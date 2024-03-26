package ch06;


public class Rectangle {
    private double lenth;
    private double width;
    //构造方法
    // public Rectangle(double lenth,double width){
    // this.lenth=lenth;
    // this.width=width;
    // }
    //公有方法访问私有成员-api
    public void setRect(double lenth,double width){
        this.lenth=lenth;
        this.width=width;
    }
    double getArea(){
        return lenth*width;
    }
    double getLength(){
        return (lenth+width)*2;
    }
}

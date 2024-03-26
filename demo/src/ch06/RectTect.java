package ch06;

public class RectTect {
    public static void main(String[] args) {
        Rectangle pb=new Rectangle();
        //对象访问格式
        pb.setRect(20, 15);
        System.out.println("面积"+pb.getArea());
        System.out.println("周长"+pb.getLength());
    }
}

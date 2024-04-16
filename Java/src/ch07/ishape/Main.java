package ch07.ishape;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(8);
        System.out.println(circle.getArea());
        System.out.println(circle.getLength());

        IShape rectangle=new Rectangle(10, 7);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getLength());
    }
}

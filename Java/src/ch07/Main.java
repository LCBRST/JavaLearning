package ch07;

public class Main {
    public static void main(String[] args) {
        //创建一个小车对象
        Car car=new Car("Xiaomi SU7",250,5);
        //创建一个公交车对象
        Bus bus=new Bus("宝宝巴士",100,50);
        HEV hev=new HEV("BYD 秦Plus", 180, 5, 50);
        car.startEngine();
        bus.honk();
        System.out.println(hev.getBrand());
    }
}

package ch07;

public class HEV extends Car{
    private double electricity;
    private double oil;
    // 构造方法
    public HEV(String brand,int maxSpeed,int numberOfSeats,double electricity){
        super(brand, maxSpeed, numberOfSeats);
        this.electricity=electricity;
        System.out.println("HEV Mark(with 4 parameter)");
    }
    public HEV(String brand,int maxSpeed,int numberOfSeats,double electricity,double oil){
        super(brand, maxSpeed, numberOfSeats);
        this.electricity=electricity;
        this.oil=oil;
        System.out.println("HEV Mark(with 5 parameter)");
    }
    public double getElectricity(){
        return electricity;
    }
    public double getOil(){
        return oil;
    }
}

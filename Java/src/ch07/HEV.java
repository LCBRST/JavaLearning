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
    public double getElectricity(){
        return electricity;
    }
}

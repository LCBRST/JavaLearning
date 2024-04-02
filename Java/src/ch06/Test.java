package ch06;

public class Test {
    void output(int x){
        System.out.println("x="+x);
    }
    public static void main(String[] args){
        // output(5);
        Test t1=new Test();
        t1.output(10);
    }
}

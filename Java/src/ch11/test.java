package ch11;

class Box<T,K> {
    private T t;
    private K i;
    Box(T t1,K i1){

    }
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public K getI() {
        return i;
    }
    public void setI(K i) {
        this.i = i;
    }
}
public class test{
    public static void main(String[] args) {
        Box<Integer,String> isBox=new Box<Integer,String>(null, null);
        isBox.setT(10);
        isBox.setI("Hello");
        Box<String,Integer> siBox=new Box<String,Integer>(null, null);
        siBox.setI(10);
        siBox.setT("Hello");
        System.out.println(isBox.getT()+isBox.getI());
        System.out.println(siBox.getT()+siBox.getI());
    }
}

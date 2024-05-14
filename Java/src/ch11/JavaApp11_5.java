package ch11;

public class JavaApp11_5 {
    public static void main(String[] args) {
        GeneralType<Double> g1=new GeneralType<>(25.0);
        System.out.println(g1.getObj());
    }
}


class GeneralType<T extends Number>{
    private T obj;
    public GeneralType(T obj){
        this.obj=obj;
    }
    public T getObj(){
        return obj;
    }
}
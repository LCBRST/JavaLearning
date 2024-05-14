package ch11;

public class JavaApp11_3<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
    public static void main(String[] args) {
        //泛型实例化字符串
        JavaApp11_3<String> f1=new JavaApp11_3<>();
        f1.setObj("张三");
        String name=f1.getObj();
        System.out.print(name);
        //泛型实例化双精度
        JavaApp11_3<Double> f2=new JavaApp11_3<>(); 
        f2.setObj(85.0);
        double score=f2.getObj();
        System.out.print(score);
    }
}

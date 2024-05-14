package ch11;

public class JavaApp11_6 {
    public static void main(String[] args) {
        GenType<String> g1=new GenType<>();
        g1.setObj("王磊");
        g1.showObj(g1);
    }
}


class GenType<T>{
    private T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
    public void showObj(GenType<? extends String> o){
        System.out.println(o.getObj());
    }
}
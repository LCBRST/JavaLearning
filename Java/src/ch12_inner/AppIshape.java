package ch12_inner;

interface Ishape{
    void shape();
}
class MyType{
    public void out(Ishape s){
        s.shape();
    }
}
public class AppIshape {
    public static void main(String[] args) {
        MyType my=new MyType();
        my.out(new Ishape() {
            @Override
            public void shape(){
                System.out.println("输出形状");
            }
        });
    }
}

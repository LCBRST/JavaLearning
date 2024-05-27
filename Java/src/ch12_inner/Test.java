package ch12_inner;

public class Test {
   static class Inner {
    String name;
    
   }
    public static void main(String[] args) {
        //创建匿名内部类对象，并调用其方法
        (new Inner(){
            public void setName(String n){
                name=n;
                System.out.println(name);
            }
        }).setName("王");
    }
}

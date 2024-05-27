package ch12;

import java.util.ArrayList;
import java.util.List;

public class Anno1 extends java.lang.Object{
    @Override //标识该方法是要重写父类的方法
    public String toString(){
        return super.toString();
    }
    @Deprecated
    public static void method1(){
        //过时方法
    }
    public static void method2(){
        //新方法
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // method1();
        @SuppressWarnings("rawtypes")
        List list=new ArrayList<>();
        list.add("abc");
    }

}

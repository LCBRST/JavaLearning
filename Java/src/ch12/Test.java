package ch12;

import java.lang.reflect.Constructor;

@SuppressWarnings(value = { "all" })
public class Test {
    public static void main(String[] args) throws Exception {
        // Person p1=new Person();
        // p1.smile();
        // Person p2=new Student();
        // p2.smile();
        String str1="ch12.Person";
        //获得Class对象的方法
        
        Class cls1=Class.forName(str1);
        Person p1=(Person)cls1.newInstance();
        p1.smile();
        //2.用类名调用class
        Class cls2=Person.class;
        Constructor cobj=cls2.getConstructor(String.class,int.class);
        Person p3=(Person) cobj.newInstance("张三",20);
        //通过对象调用getclass方法
        Person p2 =new Person();
        Class cls3=p2.getClass();

        System.out.println(p3.toString());

    }
}

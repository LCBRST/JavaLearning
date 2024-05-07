package ch10;

import java.io.Serializable;

public class Student implements Serializable{//Student实现了序列化接口Serializable
    String sNo,name;
    int age;
    public Student(String sNo,String name,int age){
        this.sNo =sNo;
        this.name=name;
        this.age=age;
    }
}

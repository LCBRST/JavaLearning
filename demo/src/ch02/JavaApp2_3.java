package ch02;

import java.util.*;

public class JavaApp2_3 {
    public static void main(String[] args){
        String str=" ";
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入一串字符");
            //str=sc.nextLine();//实现从键盘输入一行字符
            str=sc.next();
        }
        System.out.println("您输入的字符串是："+str);
    }
    
}
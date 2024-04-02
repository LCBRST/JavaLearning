package ch02;

import java.util.Scanner;
public class JavaApp2_3_1 {
    public static void main(String[] args){
        //完成从键盘输入两个整数，并输出他们的和
        int num1=0,num2=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入第一个整数：");
            if(sc.hasNextInt()) num1=sc.nextInt();
            System.out.println("请输入第二个整数：");
            if(sc.hasNextInt()) num2=sc.nextInt();
        }
        //System.out.println(num1+"+"+num2+"="+(num1+num2));
        int sum=num1+num2;
        System.out.println(num1+"+"+num2+"="+sum);
    }
    
}

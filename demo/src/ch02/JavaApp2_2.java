package ch02;
import java.util.Scanner;
public class JavaApp2_2 {
    public static void main(String[] args){
        int i=0;
        //float f=0.0f;
        try (//创建Scanner类对象 完成从键盘输入操作
        Scanner scan = new Scanner(System.in)) {
            //从键盘输入一个整数
            if(scan.hasNextInt()) i=scan.nextInt();
        }
        System.out.println("您输入的整数是："+i);
    }
}

package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaApp5_1 {

    public static void main(String[] args)throws IOException{
        //声明一个数组
        int[] data;
        //定义n个数组
        int n=10;
        data=new int[n];
        //从键盘输入几个变量到date[]
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<data.length;i++){
            data[i]=Integer.parseInt(buf.readLine());
        }
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaApp5_2 {
    public static void main(String[] args) throws IOException{
        int[] data;
        data=new int[10];
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<data.length;i++){
            data[i]=Integer.parseInt(buf.readLine());
        }
        //定义最大值max1;次大值max2
        int max,sec;
        if(data[0]<data[1]){
            max=data[1];
            sec=data[0];
        }else{
            max=data[0];
            sec=data[1];
        }
        for(int i=2;i<data.length;i++){
            if(data[i]>max){
                sec=max;
                max=data[i];
            }else if(data[i]>sec){
                sec=data[i];
            }
        }
        System.out.println("最大值是"+max+"次大值是"+sec);
    }
}

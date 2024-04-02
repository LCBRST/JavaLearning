package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaApp5_7 {

    public static void main(String[] args) throws IOException{
        // 手机号加密
        String tel="";
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        tel=buf.readLine();//13812345678
        System.out.println(tel.substring(0,3)+"****"+tel.substring(7));//138****5678
    }
}
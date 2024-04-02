package ch05;

import java.util.Scanner;

public class JavaApp5_8 {
    public static void main(String[] args) {
        // 判断回文字符串
        // 构建原字符串的逆序串
        String str="";
        String newStr="";
        String sub="";
        try (Scanner sc = new Scanner(System.in)) {
            str=sc.nextLine();
        }
        for(int i=0;i<str.length();i++){
            sub=str.substring(i, i+1);
            newStr=sub+newStr;
        }
        if(newStr.equals(str)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}

package otherSrc.homeWork;

import java.util.Scanner;


public class homeWork3 {
    public static void main(String[] args) {
        String str1,str2,newStr;
        try (Scanner sc = new Scanner(System.in)) {
            str1=sc.nextLine();
            str2=sc.nextLine();
        }
        newStr=str1+str2;
        newStr=newStr.toUpperCase();
        System.out.println(newStr);
    }
}

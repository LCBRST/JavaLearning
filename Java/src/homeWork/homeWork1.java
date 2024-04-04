package homeWork;

import java.util.Scanner;
import java.util.regex.Pattern;

public class homeWork1 {
    public static void main(String[] args) {
        // 计算输入的字符串英文字符数字其他字符的个数
        String str;
        String[] newStrings;
        String matchNumber="[0-9]",matchEng="[A-Za-z]";
        Scanner sc=new Scanner(System.in);
        int numNum=0,engNum=0,otherNum=0;
        str=sc.nextLine();
        newStrings=str.split("");
        for(int i=0;i<str.length();i++){
            if(Pattern.matches(matchNumber, newStrings[i])){
                numNum=numNum+1;
            }else if(Pattern.matches(matchEng, newStrings[i])){
                engNum=engNum+1;
            }else{
                otherNum=otherNum+1;
            }
        }
        System.out.println(numNum);
        System.out.println(engNum);
        System.out.println(otherNum);

    }
}

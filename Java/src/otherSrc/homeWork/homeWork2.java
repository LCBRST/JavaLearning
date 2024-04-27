package otherSrc.homeWork;

import java.util.Scanner;

public class homeWork2 {
    
    public static void main(String[] args) {
        // 输入一段字符串按给定区间切割
        String str,newStr;
        int beginIndex,endIndex;
        try (Scanner sc = new Scanner(System.in)) {
            str=sc.nextLine();
            beginIndex=sc.nextInt()-1;
            endIndex=sc.nextInt();
        }
        newStr=str.substring(beginIndex, endIndex);
        System.out.println(newStr);
    }
}

package ch05;

public class JavaApp5_8 {
    public static void main(String[] args) {
        // 判断回文字符串
        // 构建原字符串的逆序串
        String str="anc";
        String newStr="";
        String sub="";

        for(int i=0;i<str.length();i++){
            sub=str.substring(i, i+1);
            newStr=sub+newStr;
        }
        if(newStr.equals(sub)){
            System.out.println("该串是回文串");
        }
    }
}

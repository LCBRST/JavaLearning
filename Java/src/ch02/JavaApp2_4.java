package ch02;

import java.io.*;//导入io包中的所有类
public class JavaApp2_4 {
    public static void main(String[] args) throws IOException{
        //完成从键盘输入两个小数并输出他们的和
        double x1=0.0,x2=0.0;
        //InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入第一个小数");
        String str1=buf.readLine();
        x1=Double.parseDouble(str1);
        System.out.println("请输入第二个小数");
        String str2=buf.readLine();
        x2=Double.parseDouble(str2);
        System.out.println((x1+x2));
    }
}

package ch04;
import java.io.*;
public class JavaApp4_1{
    //输入三组坐标 判断能不能构成三角形
    public static void main(String[] args) throws IOException{
        double x1,y1;//第一组坐标
        double x2,y2;//第二组坐标
        double x3,y3;//第三组坐标
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        //读入各值
        String str=buf.readLine();
        x1=Double.parseDouble(str);
        str=buf.readLine();
        y1=Double.parseDouble(str);
        str=buf.readLine();
        x2=Double.parseDouble(str);
        str=buf.readLine();
        y2=Double.parseDouble(str);
        str=buf.readLine();
        x3=Double.parseDouble(str);
        str=buf.readLine();
        y3=Double.parseDouble(str);
        //计算两点的距离
        double d1,d2,d3;
        d1=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        d2=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        d3=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        /*
        double max,mid,min;
        max=Math.max(d1,d2);
        max=Math.max(max,d3);
        min=Math.min(d1, d2);
        min=Math.min(min,d3);
        mid=(d1+d2+d3)-(max+min);
        if((min+mid)>max) System.out.println("YES");
        */
        if(d1+d2>d3&&d1+d3>d2&&d2+d3>d1) System.out.println("YES");
        else System.out.println("NO");
    }
}
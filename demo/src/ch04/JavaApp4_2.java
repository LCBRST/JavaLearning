package ch04;
import java.io.*;

public class JavaApp4_2 {
    //从键盘输入一种水果的名称 输入对应水果价格
    public static void main(String[] args)throws IOException{
        String fruit;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入您要查询的水果的名称");
        fruit=buf.readLine();
        switch (fruit) {
            case "apple":
                System.out.println("苹果的价格是5.5元/500g");
                break;
            case "banana":
                System.out.println("香蕉的价格是2元/500g");
                break;
            case "lemon":
                System.out.println("柠檬的价格是1元/个");
                break;
            default:
                System.out.println("没有此水果");
                break;
        }
    }
}

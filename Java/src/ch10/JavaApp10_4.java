package ch10;

import java.io.FileWriter;
import java.io.IOException;

public class JavaApp10_4 {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("test.txt");
        char[] c={'H','E','L','L','O'};
        String str="欢迎使用JAVA";
        fw.write(c);
        fw.write(str);
        fw.close();
    }
}

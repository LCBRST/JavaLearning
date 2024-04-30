package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaApp10_3 {
    public static void main(String[] args) throws IOException{
        char[] c=new char[500];
        try{
            FileReader fr=new FileReader("test.txt");
            int num=fr.read(c);
            String str=new String(c,0,num);
            System.out.println("读取的字符个数为："+num+",其内容如下：");
            System.out.println(str);
            fr.close();
        }catch(FileNotFoundException e){
            System.out.println("文件找不到");
        }
    }
} 

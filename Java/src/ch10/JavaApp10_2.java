package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaApp10_2 {
    public static void main(String[] args) {
        //对demo.png执行复制操作
        FileInputStream fin=null;
        FileOutputStream fout=null;
        try{
            fin=new FileInputStream("demo.png");
            fout=new FileOutputStream("demo-copy.png");
            byte[] x=new byte[fin.available()];
            fin.read(x);
            fout.write(x);
        }catch(FileNotFoundException e){
            System.out.println("文件未找到");
        }
        catch(IOException e){
            System.out.println("输出失败");
        }finally{
            try{
                fin.close();
                fout.close();
            }catch(IOException e){

            }
        }
    }
}

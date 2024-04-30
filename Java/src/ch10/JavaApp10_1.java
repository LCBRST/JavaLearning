package ch10;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaApp10_1 {
    public static void main(String[] args) {
        //从键盘(FileDescriptor.in)字符并存入myfile.txt
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try{
            //创建一个输入流对象
            fin = new FileInputStream(FileDescriptor.in);
            fout = new FileOutputStream("myfile.txt");
            char ch;
            while((ch=(char)fin.read())!='#'){
                fout.write(ch);
            }
            //利用输入流对象fin调用read()方法实现输入字符
        }catch(IOException e){
            System.out.println("输入输出错误");
        }finally{
            try{
                fin.close();
                fout.close();
            }catch(IOException e){

            }
        }
        //从myfile.txt读出内容并输出到屏幕(FileDescriptor.out)中
        try{
            fin = new FileInputStream("myfile.txt");
            fout = new FileOutputStream(FileDescriptor.out);
            //读取文件内容
            while (fin.available()>0) {
                int x=fin.read();
                fout.write(x);
            }
        }catch(FileNotFoundException e){
            System.out.println("文件未找到");
        }
        catch(IOException e){
            System.out.println("输入输出错误");
        }finally{
            try{
                fin.close();
                fout.close();
            }catch(IOException e){

            }
        }
    }
}

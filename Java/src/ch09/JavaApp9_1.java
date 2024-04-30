package ch09;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaApp9_1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //从键盘输入一串字符 存入myfile.txt
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try{
            //创建一个输入流对象与键盘的连接
            fis = new FileInputStream(FileDescriptor.in);
            //创建一个输出流
            fos=new FileOutputStream("myfile.txt");
            char ch;
            while((ch=(char)fis.read())!='#'){
                fos.write(ch);
            }
        }catch(IOException e){

        }
    }
}

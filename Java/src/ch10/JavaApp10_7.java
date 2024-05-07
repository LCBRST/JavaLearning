package ch10;

import java.io.File;
import java.io.IOException;

public class JavaApp10_7 {
    public static void main(String[] args) {
        //通过File类的实例对磁盘文件或文件夹进行管理
        File f1=new File("//workspaces//Java//Java//src//ch10//sources");
        //创建一个新的f2表示/workspaces/Java/Java/src/ch10/sources/demo
        File f2=new File("//workspaces//Java//Java//src//ch10//sources//demo");
        //创建一个f3表示/workspaces/Java/Java/src/ch10/sources/demo.txt
        File f3=new File("//workspaces//Java//Java//src//ch10//sources","demo.txt");
        if(f1.exists()&&f1.isDirectory()){
            System.out.println("文件夹存在");
            //f1对应的文件夹存在，显示目录列表
            for(int i=0;i<f1.list().length;i++){
                System.out.println(f1.list()[i]);
            }
        }
        if(f2.exists()&&f2.isDirectory()){
            System.out.println("文件夹存在");
        }else{
            System.out.println("文件夹不存在,已创建");
            f2.mkdirs();
        }
        if(f3.exists()&&f3.isFile()){
            System.out.println("文件存在");
        }else{
            try {
                f3.createNewFile();
                System.out.println("文件不存在,已创建");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

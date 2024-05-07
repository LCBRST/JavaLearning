package ch10;

import java.io.File;

public class JavaApp10_8 {
    public static void main(String[] args) {
        File f1=new File("//workspaces//Java//Java//src//ch10//sources","demo.txt");
        if(f1.exists()&&f1.isFile()){
            System.out.println(f1.getName()+" "+f1.length()+" "+f1.getPath());
        }
    }
}

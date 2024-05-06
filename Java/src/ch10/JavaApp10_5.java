package ch10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaApp10_5 {
    //利用BufferedReader按行读取当前文件夹myfile.txt并输出读取了多少行
    // 利用BufferedWriter将myfile.txt中的内容写到data.txt中 
    public static void main(String[] args) {
        String thisLine = null;
        int count = 0;
        try{
            FileReader fr=new FileReader("/workspaces/Java/Java/src/ch10/sources/myfile.txt");
            BufferedReader bfr=new BufferedReader(fr);
            FileWriter fw=new FileWriter("/workspaces/Java/Java/src/ch10/sources/data.txt");
            BufferedWriter bfw=new BufferedWriter(fw);
            while((thisLine=bfr.readLine())!=null){
                System.out.print(thisLine+"\n");
                count++;
                bfw.write(thisLine);
                bfw.newLine();
            }
            bfw.flush();
            System.out.println("文本共有"+count+"行");
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch(IOException e){
            System.out.println("输入输出错误");
        }
    }
}

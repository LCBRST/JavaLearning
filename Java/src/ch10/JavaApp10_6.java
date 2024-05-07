package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaApp10_6 {
    //声明数组存放学生数据
    Student[] stu=new Student[2];
    public static void main(String[] args) {
    //将2023级计科2班的学生数据保存到obj.dat
    JavaApp10_6 sO=new JavaApp10_6();    
    sO.saveObject();
    sO.readObject();
    }

    public void saveObject(){
        //将数据保存到obj.dat
        //创建对象输出流
            stu[0]=new Student("001","zhangsan",20);
            stu[1]=new Student("002", "lisi", 21);
        
        try{
            FileOutputStream fos=new FileOutputStream("/workspaces/Java/Java/src/ch10/sources/obj.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //将学生对象写入
            oos.writeObject(stu[0]);
            oos.writeObject(stu[1]);
            oos.close();

        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }catch(IOException e){
            System.out.println("输入输出错误");
        }
    }
    //利用ObjectInputStream读取obj.dat
    public void readObject(){
        try{
            FileInputStream fis=new FileInputStream("/workspaces/Java/Java/src/ch10/sources/obj.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student st=(Student)ois.readObject();
            for(int i=0;i<stu.length;i++){
            System.out.println(st.sNo+"\n"+st.name+"\n"+st.age+"\n");
            }
            ois.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }catch(IOException e){
            System.out.println("输入输出错误");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
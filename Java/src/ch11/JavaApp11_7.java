package ch11;

import java.util.LinkedList;
import java.util.Scanner;

// 定义一个堆栈类
class Stack<T>{
    LinkedList<T> li=new LinkedList<>();//创建一个空链表
    //入栈push
    public void push(T name){
        li.addFirst(name);
    }
    //出栈pop
    public T pop(){
        return li.removeFirst();
    }
    //判断栈是否为空isEmpty
    public boolean isEmpty(){
        return li.isEmpty();
    }
    public void printStack(){
        while (!li.isEmpty()) {
            System.out.println(li.pop());
        }
    }
}
//定义一个一个队列
class List<T>{
    LinkedList<T> li=new LinkedList<>();//创建一个空链表
    //入栈push
    public void push(T name){
        li.addFirst(name);
    }
    //出栈pop
    public T pop(){
        return li.removeFirst();
    }
    //判断栈是否为空isEmpty
    public boolean isEmpty(){
        return li.isEmpty();
    }
    public void printStack(){
        while (!li.isEmpty()) {
            System.out.println(li.pop());
        }
    }
}
public class JavaApp11_7 {
    public static void main(String[] args) {
        //利用堆栈存放学生信息
        Stack<String> stack=new Stack<>();
        Scanner sc=new Scanner(System.in);
        //输入学生数据，quit推出
        while(true){
            String str=sc.next();
            if(str.equals("quit")){
                break;
            }else{
                stack.push(str); 
            }
            //输出学生数据
            stack.printStack();
            sc.close();
        }

        
    }
}

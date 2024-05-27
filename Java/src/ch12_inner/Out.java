package ch12_inner;

public class Out {
    private int age;
    public class Student {
        private String name;

        public Student(String name,int age) {
            this.name = name;
            Out.this.age=age;
        }
        public void output(){
            System.out.println("姓名"+this.name+" 年龄"+age);
        }
        
    }
    public void output(){
    Student stu=new Student("张三",20);
    stu.output();           
    }
    public static void main(String[] args) {
        Out o=new Out();
        o.output();
    }
}

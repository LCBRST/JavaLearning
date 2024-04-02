package ch02;
    public class JavaApp2_1 {
        static int x;
        public static void main(String[] args){
            output();
            boolean bl=false;
            float y=Float.parseFloat("137.5");
            int i=Integer.parseInt("123");
            System.out.println(bl);
            System.out.println(x);
            System.out.println(y+5);
            System.out.println(i+2);
        }
        public static void output(){
            System.out.println("这是一个输出方法");
        }
        
    }
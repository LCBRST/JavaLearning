package ch11;

public class JavaApp11_4 {
    public static <E> void display(E[] list) {//定义一个泛型方法，实现数组遍历
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]);
        }
        System.out.print("\n");
        
    }
    public static void main(String[] args) {
        String[] color={"红","橙","黄","绿","蓝","靛","紫"};
        Integer[] num={1,2,3,4,5,6,7,8,9,0};
        display(color);
        display(num);
    }
}

package ch08;

public class JavaApp8_1 {
    public static void main(String[] args) {
        // 异常处理
        //输出一个数组的所有元素
        int[] a={1,2,3,4,5};
        int x=5,y=0;
        for(int i=0;i<=5;i++){
            try{
                System.out.println("a["+i+"]="+a[i]);
                System.out.println(x/y);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("数组下标越界了 "+e.getMessage());
            }
            catch(ArithmeticException e){
                System.out.println("你家除数能为0？ "+e.getMessage());
            }
            finally{
                
            }
        }
            System.out.println("5/0");
    }
}

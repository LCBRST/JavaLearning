package ch04;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class JavaApp4_3 {
    public static void main(String[] args) throws IOException{
        //计算100内的素数
        /*
        int x;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        x=Integer.parseInt(buf.readLine());
        */
        //x对2到x-1的数求余，余不为0
        int x;
        int i;
        for(x=2;x<=100;x++){
            for(i=2;i<=x-1;i++){
                if(x%i==0){ 
                    break;
                }
            }
            //i有两种情况：=x <x
            if(i==x){
                System.out.println("YES");
        
            }else{
                System.out.println("NO");
            }
        }
    }
    
}

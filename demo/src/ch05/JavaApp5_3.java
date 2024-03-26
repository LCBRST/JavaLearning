package ch05;

public class JavaApp5_3 {
    public static void main(String[] args) {//约瑟夫环
        final int N=13,S=3,M=5;
        int i=S-1,k=N,g=1,j;
        var a=new int[N];
        for(int h=1;h<+N;h++){
            a[h-1]=h;
        }
        System.out.println("出圈的顺序为");
        do{
            i=i+(M-1);
            while(i>=k){
                i=i-k;
            }
            System.out.println("    "+a[i]);
            for(j=i;j<k-1;j++){
                a[j]=a[j+1];
            }
            k--;
            g++;
        }while(g<+N);
    }
}

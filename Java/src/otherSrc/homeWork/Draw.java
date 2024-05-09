package otherSrc.homeWork;

import java.util.Scanner;

public class Draw {
    public void drawTrian(int line){
        for(int i=0;i<=line;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public void drawRec(int line,int width){
        for(int i=0;i<line;i++){
            for(int j=0;j<width;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public void drawPra(int line,int width){
        for(int i=0;i<line;i++){
            for(int j=0;j<width;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Draw dr=new Draw();
        Scanner sc=new Scanner(System.in);
        int chose,line,width;
        chose=sc.nextInt();
        line=sc.nextInt();
        width=sc.nextInt();
        if(chose==1){
            dr.drawTrian(line);
        }else if(chose==2){
            dr.drawRec(line,width);
        }else if(chose==3){
            dr.drawPra(line, width);
        }
        sc.close();
    }
}

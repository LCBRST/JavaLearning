package otherSrc.homeWork;

import java.util.Scanner;

public class Rect {
    int width,height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int area(){
         return width*height;
    }
    int perimeter(){
        return 2*(height+width);
    }   
}
class Main {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rect rect=new Rect(sc.nextInt(),sc.nextInt());
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
        sc.close();
    }
    
}




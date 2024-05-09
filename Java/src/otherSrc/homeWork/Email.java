package otherSrc.homeWork;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String email,user,host,dotmain,regexFir="@",regexSec="\\.";
        String[] newStringsFir,newStringsSec;
        email=sc.nextLine();
        newStringsFir=email.split(regexFir,2);
        newStringsSec=newStringsFir[1].split(regexSec,2);
        user=newStringsFir[0];
        host=newStringsSec[0];
        dotmain=newStringsSec[1];
        System.out.println(user+"\n"+host+"\n"+dotmain);
        sc.close();
    }
    
}

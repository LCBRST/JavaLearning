package homeWork;
import java.util.Scanner;
public class homeWork4 {

	public static void main(String[] args){
		String str;
		int num=0,big=0,small=0,other=0,counts=0;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		char[] characters=str.toCharArray();
		for(int i=0;i<str.length();i++){

			if(Character.isDigit(characters[i])){
				num++;
			}else if(Character.isUpperCase(characters[i])){
				big++;
			}else if(Character.isLowerCase(characters[i])){
				small++;
			}else{
				other++;
			}
		}
		if(num!=0){
			counts++;
		}
		if(big!=0){
			counts++;
		}
		if(small!=0){
			counts++;
		}
		if(other!=0){
			counts++;
		}
		System.out.println(counts);
	}	
}



package otherSrc.homeWork;

import java.util.Scanner;

public class Animals {
    String name;
    
    public Animals(String name){
        this.name=name;
    }
    public void makeSound(){
        System.out.println(name+" : 叽里咕噜");
    }
}

class cat extends Animals{

    public cat(String name) {
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name+" : 喵喵");
    }
}
class dog extends Animals{
    public dog(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name+ " : 汪汪");
    }
}
class duck extends Animals{
    public duck(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name+ " : 嘎嘎");
    }
}
class chicken extends Animals{
    public chicken(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name+ " : 咯咯");
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String animal=sc.nextLine();
        
        switch (animal) {
            case "cat":
                Animals cat=new cat(animal);
                cat.makeSound();
                break;
            case "dog":
                Animals dog=new dog(animal);
                dog.makeSound();
                break;
            case "duck":
                Animals duck=new duck(animal);
                duck.makeSound();
                break;     
            case "chicken":
                Animals chicken=new chicken(animal);
                chicken.makeSound();
                break;   
            default:
                Animals animals=new Animals(animal);
                animals.makeSound();
                break;
        }
        sc.close();
    }
}
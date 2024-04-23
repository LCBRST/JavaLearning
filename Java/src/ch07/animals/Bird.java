package ch07.animals;

public class Bird extends Animal {  
    // Bird类可能还有特有的属性，比如翅膀的长度、能够飞行的能力等  
  
    public Bird(String name) {  
        super(name);  
    }  
  
    // 实现父类的抽象方法 makeSound  
    @Override  
    public void makeSound() {  
        System.out.println(name + " sings."); // 鸟鸣叫  
    }  
  
    // Bird类可能还有特有的方法，比如飞行  
    public void fly() {  
        System.out.println(name + " is flying.");  
    }  
}

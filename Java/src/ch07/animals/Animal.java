package ch07.animals;

public abstract class Animal {  
    // 动物共有的属性，比如名字  
    protected String name;  
  
    // 构造函数，用于初始化动物的名字  
    public Animal(String name) {  
        this.name = name;   
    }  
  
    // 抽象方法 makeSound，代表动物发出声音的行为  
    // 由于不同的动物会发出不同的声音，因此这个方法被声明为抽象的  
    // 需要在具体的动物子类中实现  
    public abstract void makeSound();  
  
    // 非抽象方法 move，代表动物的移动行为  
    // 这个行为对于所有动物来说都是相似的，因此在抽象类中给出了具体的实现  
    public void move() {  
        System.out.println(name + " is moving.");  
    }  
}

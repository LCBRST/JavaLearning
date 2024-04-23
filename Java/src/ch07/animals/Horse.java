package ch07.animals;


public class Horse extends Animal {  
    // Horse类可能具有特有的属性，比如毛色、奔跑速度等  
  
    public Horse(String name) {  
        super(name);  
    }  
  
    // 实现父类的抽象方法 makeSound  
    @Override  
    public void makeSound() {  
        System.out.println(name + " whinnies."); // 马发出嘶鸣声  
    }  
  
    // Horse类可能还有特有的方法，比如奔跑  
    public void gallop() {  
        System.out.println(name + " is galloping.");  
    }  
}

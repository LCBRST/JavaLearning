package ch07.animals;

public class Lion extends Animal {  
    // Lion类可能具有特有的属性，比如鬃毛的颜色、领地意识等  
  
    public Lion(String name) {  
        super(name);  
    }  
  
    // 实现父类的抽象方法 makeSound  
    @Override  
    public void makeSound() {  
        System.out.println(name + " roars loudly."); // 狮子大声吼叫  
    }  
  
    // Lion类可能还有特有的方法，比如守护领地  
    public void defendTerritory() {  
        System.out.println(name + " is defending its territory.");  
    }  
}

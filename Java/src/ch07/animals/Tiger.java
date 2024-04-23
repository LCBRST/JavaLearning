package ch07.animals;



public class Tiger extends Animal {  
    // Tiger类可能具有特有的属性，比如条纹的颜色、狩猎能力等  
  
    public Tiger(String name) {  
        super(name);  
    }  
  
    // 实现父类的抽象方法 makeSound  
    @Override  
    public void makeSound() {  
        System.out.println(name + " roars."); // 老虎吼叫  
    }  
  
    // Tiger类可能还有特有的方法，比如狩猎  
    public void hunt() {  
        System.out.println(name + " is stalking its prey.");  
    }  
}

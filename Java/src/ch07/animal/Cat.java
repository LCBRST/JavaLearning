
public class Cat extends Animal {  
    public Cat(String name) {  
        super(name);  
    }  
  
    // 实现父类的抽象方法 makeSound  
    @Override  
    public void makeSound() {  
        System.out.println(name + " meows."); // 猫喵喵叫  
    }  
}

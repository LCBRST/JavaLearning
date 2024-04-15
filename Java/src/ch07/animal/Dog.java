

public class Dog extends Animal {  
    // 构造函数，调用父类的构造函数初始化名字，并可能添加其他初始化代码  
    public Dog(String name) {  
        super(name);  
    }  
  
    // 实现父类的抽象方法 makeSound  
    @Override  
    public void makeSound() {  
        System.out.println(name + " barks."); // 狗汪汪叫  
    }  
}  
  

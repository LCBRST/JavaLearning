package ch07.animals;



public class Elephant extends Animal {  
    // Elephant类可能还有特有的属性，比如象牙的长度、象鼻的长度等  
  
    public Elephant(String name) {  
        super(name);  
    }  
  
    // 实现父类的抽象方法 makeSound  
    @Override  
    public void makeSound() {  
        System.out.println(name + " trumpets."); // 大象发出喇叭声  
    }  
  
    // Elephant类可能还有特有的方法，比如用象鼻喷水  
    public void sprayWater() {  
        System.out.println(name + " sprays water with its trunk.");  
    }  
}

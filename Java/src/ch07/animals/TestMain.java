package ch07.animals;



public class TestMain {

	    public static void main(String[] args) {  
	        // 创建不同类型的动物对象  
	        Animal dog = new Dog("泰迪");  
	        Animal cat = new Cat("加菲猫");  
	        Animal bird = new Bird("啄木鸟");  
	        Animal elephant = new Elephant("可爱的小象");  
	  
	        // 调用每个动物的行为特征方法  
	        System.out.println("Dog:");  
	        dog.makeSound();  
	        dog.move();  
	  
	        System.out.println("\nCat:");  
	        cat.makeSound();  
	        cat.move();  
	  
	        System.out.println("\nBird:");  
	        bird.makeSound();  
	        bird.move();  
//	        bird.fly();
	        ((Bird)bird).fly(); // 强制类型转换，因为fly是Bird类特有的方法  

	  
	        System.out.println("\nElephant:");  
	        elephant.makeSound();  
	        elephant.move();  
	        ((Elephant)elephant).sprayWater(); // 强制类型转换，因为sprayWater是Elephant类特有的方法  
	    }  
	}  

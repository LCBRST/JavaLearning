package otherSrc.homeWork;

import java.util.Scanner;

// 定义图形类
class Shape {
    double sideLength;

    // 构造方法
    Shape(double sideLength) {
        this.sideLength = sideLength;
    }

    // 求面积的方法，子类将重写这个方法
    double calculateArea() {
        return 0.0; // 默认返回0，子类应该重写这个方法
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("请输入图形名字：");
            String shapeName = scanner.nextLine();

            Shape shape;

            // 根据输入的图形名字创建相应的图形对象
            switch (shapeName) {
                case "正三角形":
                    System.out.println("请输入正三角形的边长：");
                    double triangleSideLength = scanner.nextDouble();
                    shape = new Triangle(triangleSideLength);
                    break;
                case "圆形":
                    System.out.println("请输入圆形的半径：");
                    double circleRadius = scanner.nextDouble();
                    shape = new Circle(circleRadius);
                    break;
                case "正方形":
                    System.out.println("请输入正方形的边长：");
                    double squareSideLength = scanner.nextDouble();
                    shape = new Square(squareSideLength);
                    break;
                default:
                    System.out.println("Can't calculate");
                    return;
            }

            // 输出面积
            double area = shape.calculateArea();
            System.out.printf("面积为: %.2f%n", area);
        }
    
    }
}

// 定义正三角形类
class Triangle extends Shape {
    // 构造方法
    Triangle(double sideLength) {
        super(sideLength);
    }

    // 重写求面积的方法
    @Override
    double calculateArea() {
        return Math.sqrt(3) / 4 * sideLength * sideLength;
    }
}

// 定义圆形类
class Circle extends Shape {
    // 构造方法
    Circle(double sideLength) {
        super(sideLength);
    }

    // 重写求面积的方法
    @Override
    double calculateArea() {
        return 3.14 * sideLength * sideLength;
    }
}

// 定义正方形类
class Square extends Shape {
    // 构造方法
    Square(double sideLength) {
        super(sideLength);
    }

    // 重写求面积的方法
    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }
}


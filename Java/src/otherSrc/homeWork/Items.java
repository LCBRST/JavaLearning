package otherSrc.homeWork;

import java.util.Scanner;

// 定义商品类
class Commodity {
    String name;
    double price;

    Commodity(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// 桌布类继承自商品类
class Tablecloth extends Commodity {
    int quantity;

    Tablecloth(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }
}

// 肥皂类继承自商品类
class Soap extends Commodity {
    int quantity;

    Soap(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }
}

// 餐巾纸类继承自商品类
class Napkin extends Commodity {
    int quantity;

    Napkin(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入桌布信息
        double tableclothPrice = scanner.nextDouble();
        int tableclothQuantity = scanner.nextInt();
        Tablecloth tablecloth = new Tablecloth("桌布", tableclothPrice, tableclothQuantity);

        // 输入肥皂信息
        double soapPrice = scanner.nextDouble();
        int soapQuantity = scanner.nextInt();
        Soap soap = new Soap("肥皂", soapPrice, soapQuantity);

        // 输入餐巾纸信息
        double napkinPrice = scanner.nextDouble();
        int napkinQuantity = scanner.nextInt();
        Napkin napkin = new Napkin("餐巾纸", napkinPrice, napkinQuantity);

        // 计算每种商品的总价
        double totalTableclothPrice = tablecloth.price * tablecloth.quantity;
        double totalSoapPrice = soap.price * soap.quantity;
        double totalNapkinPrice = napkin.price * napkin.quantity;

        // 找出总价最大的商品并输出
        double maxTotalPrice = Math.max(totalTableclothPrice, Math.max(totalSoapPrice, totalNapkinPrice));
        if (maxTotalPrice == totalTableclothPrice) {
            System.out.printf("桌布总价最大，为%.0f元",maxTotalPrice);
        } else if (maxTotalPrice == totalSoapPrice) {
            System.out.printf("肥皂总价最大，为%.0f元", maxTotalPrice);
        } else {
            System.out.printf("餐巾纸总价最大，为%.0f元", maxTotalPrice);
        }

        scanner.close();
    }
}


package com.green.day16.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(20000);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa());
        buyer.showMeTheMoney();
    }

}
class Buyer {
    private int haveMoney;
    private int haveBonusPoint;
    Buyer(int haveMoney) {
        this.haveMoney = haveMoney;
        this.haveBonusPoint = 0;
    }
    int getHaveMoney() {
        return haveMoney;
    }
    int getHaveBonusPoint() {
        return haveBonusPoint;
    }
    void setHaveMoney(int haveMoney) {
        this.haveMoney = haveMoney;
    }
    void setHaveBonusPoint(int haveBonusPoint) {
        this.haveBonusPoint = haveBonusPoint;
    }
    void buy(Product p) {
        this.haveMoney -= p.getPrice();
        this.haveBonusPoint += p.getBonusPoint();
        System.out.printf("%s 구매 완료\n", p);
    }
    void showMeTheMoney() {
        System.out.printf("money: %d, bonusPoint: %d\n", haveMoney, haveBonusPoint);
    }
    public String toString() {
        return String.format("money: %d, bonusPoint: %d", haveMoney, haveBonusPoint);
    }
}
class Product {
    private int price;
    private int bonusPoint;

    Product (final int price) {
        this.price = price;
        this.bonusPoint = price/10;
    }

    public int getPrice() {
        return price;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }
    public String toString() {
        return String.format("price: %d, bonusPoint: %d", price, bonusPoint);
    }
}
class Tv extends Product {
    Tv() {
        super(100);

    }
    public String toString() {
        return String.format("Tv %s", super.toString());
//        return String.format("Tv price: %d, bonusPoint: %d",getPrice(), getBonusPoint());
    }
}
class Computer extends Product {
    Computer() {
        super(200);

    }
    public String toString() {
        return String.format("Computer %s", super.toString());
    }

}
class Sofa extends Product {
    Sofa() {
        super(80);
    }
    public String toString() {
        return String.format("Sofa %s", super.toString());
    }

}

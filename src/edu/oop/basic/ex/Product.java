package edu.oop.basic.ex;

public class Product {
    private String pName;
    private int price;
    private String brand;


    public Product() {
    }



    public Product(String pName, int price, String brand) {
        this.pName = pName;
        this.price = price;
        this.brand = brand;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void information(){
        System.out.printf("제품명 : %s\n가격 : %,d원\n브랜드 : %s\n", getpName(), getPrice(), getBrand());
    }
}


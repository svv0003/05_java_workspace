package edu.polymorphism.ex1;

public class Electronics extends Product {

    // Electronics
    // Product 상속하고, 필드와 기본,매개변수 생성자까지만 작성하기
    // 전자제품 관련 필드들
    private int warranty; // 보증기간
    private String powerConsumption; // 전력소비량



    // {} 중괄호 형태 블록 접기/펼치기 단축키
    // ctrl + shift +  +  : 펼치기
    // ctrl + shift +  -  : 접기

    public Electronics() {
    }

    public Electronics(int warranty, String powerConsumption) {
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    public Electronics(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
    }

    public Electronics(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight, int warranty, String powerConsumption) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    // getter / setter
    public int getWarranty() {
        return warranty;
    }
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    public String getPowerConsumption() {
        return powerConsumption;
    }
    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }






}

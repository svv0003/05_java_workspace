package edu.polymorphism.ex1;

// @생성자 @파라미터생성자 @게터 @세터 @toString 모두 어노테이션으로 추후 생성할 예정!

public class Food extends Product {

    // Food
    // Product 상속하고, 필드와 기본, super만 전달받는 생성자, super + 클래스에 해당하는 작성하기
    // 식품 관련 필드들
    private String expirationDate; // 유통기한
    private String origin; // 원산지
    private boolean isOrganic; // 유기농 여부

    public Food() {
    }

    public Food(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
    }

    public Food(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight, String expirationDate, String origin, boolean isOrganic) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
        this.expirationDate = expirationDate;
        this.origin = origin;
        this.isOrganic = isOrganic;
    }

    // getter / setter
    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public boolean isOrganic() {
        return isOrganic;
    }
    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }






}

package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {

    // 필드
    static Map<String, String> productMap = new HashMap<>();
    Map<String, String> priceMap = new HashMap<>();

    // 메서드
    void addProduct(String productId, String productName, int price){
        if (productMap.get(productId) == null){
            System.out.println("이미 존재하는 상품입니다.");
        } else {
            productMap.put(productId, productName);
            priceMap.put(productId, String.valueOf(price));
            System.out.println(productName + " 상품이 추가되었습니다.");
        }
    }

    void searchProduct(String productId){
        if (productMap.get(productId) != null){
            System.out.printf("상품ID : %s\n상품명 : %s\n가격 : %s원\n",  productId, productMap.get(productId), priceMap.get(productId));
        }
    }

    void displayAllProducts(){
        System.out.println("=".repeat(20) + "전체 상품 목록" + "=".repeat(20));
        System.out.println(productMap);
        System.out.println(priceMap);
    }

    void removeProduct(String productId){
        if (productMap.get(productId) != null){
            productMap.remove(productId);
            priceMap.remove(productId);
            System.out.println(productMap.get(productId) + " 상품이 삭제되었습니다.");
        } else System.out.println("존재하지 않는 상품입니다.");
    }

    public void method() {
        productMap.put("P001", "갤럭시S24");
        priceMap.put("P001", "1200000");
        productMap.put("P002", "아이폰15");
        priceMap.put("P002", "1300000");
        productMap.put("P003", "나이키운동화");
        priceMap.put("P003", "150000");
    }


}

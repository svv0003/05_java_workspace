package edu.practice.day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StoreInventoryManager {

    public void method3() {
        Map<String, Integer> inventoryMap = new HashMap<>(); // 상품명 : 재고수량
        Map<String, Integer> priceMap = new HashMap<>();     // 상품명 : 가격
        Scanner sc = new Scanner(System.in);

        // 초기 재고 데이터
        inventoryMap.put("사과", 50);
        inventoryMap.put("바나나", 30);
        inventoryMap.put("오렌지", 0); // 재고 없음
        priceMap.put("사과", 1000);
        priceMap.put("바나나", 1500);
        priceMap.put("오렌지", 2000);

        try {
            System.out.print("구매할 상품명을 입력하세요: ");
            String productName = sc.nextLine();
            int stockQuantity = inventoryMap.get(productName);
            int productPrice = priceMap.get(productName);

            if (inventoryMap.containsKey(productName)) {
                System.out.printf("검색한 상품 정보\n상품명 : %s\n가격 : %,d원\n재고 수량 : %d개\n",  productName, productPrice, stockQuantity);
            } else {
                System.out.println("검색하신 상품은 존재하지 않습니다.");
            }

            System.out.print("구매할 수량을 입력하세요: ");
            int purchaseQuantity = sc.nextInt();
            sc.nextLine();

            if (stockQuantity >= purchaseQuantity) {
                int afterQuantity = stockQuantity - purchaseQuantity;
                int totalPrice = productPrice * purchaseQuantity;
                System.out.printf("%d개 주문하였습니다.\n주문 후 재고 수량 : %d\n", purchaseQuantity, afterQuantity);
                System.out.printf("총 구매 가격 : %,d원\n", totalPrice);
                inventoryMap.put(productName, afterQuantity);
            } else {
                System.out.println("재고가 부족합니다.\n현재 재고 수량 : " + stockQuantity);
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("수량 입력 관련 코드 작성");
        } catch (RuntimeException e) {
            System.out.println("재고 부족 관련 코드 작성");
        } catch (Exception e) {
            System.out.println("예기치 못한 문제 발생하였습니다.");
        } finally {
            sc.close();
            System.out.println("재고 관리 완료");
        }


        // 상품명 존재 여부 확인
        // 수량 입력 시 NumberFormatException 처리
        // 재고 부족 시 RuntimeException 발생 및 처리
        // 재고 차감 및 총 가격 계산
        // finally에서 Scanner 종료 및 "재고 관리 완료" 메시지


    }

}

package edu.practice.day11;

import practice.exception.ex.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountManager {

    public void method2() {
        Map<String, Integer> accountMap = new HashMap<>();  // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();     // 계좌번호 : 예금주명
        Scanner sc = new  Scanner(System.in);

        // 초기 데이터
        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");

        try {
            System.out.print("계좌번호를 입력하세요: ");
            String accountNumber = sc.nextLine();

            int accountMoney = accountMap.get(accountNumber);
            String accountOwner = ownerMap.get(accountNumber);
            if (accountMap.containsKey(accountNumber)) {
                System.out.printf("%s 님의 계좌 잔액 : %,d\n", accountOwner, accountMoney);
            } else {
                System.out.println("입력하신 계좌번호는 존재하지 않습니다.");
                return;
            }

            System.out.print("출금할 금액을 입력하세요: ");
            int transfer = sc.nextInt();
            sc.nextLine();

            if (accountMoney >= transfer) {
                System.out.printf("%,d원을 출금합니다.\n출금 후 잔액 : %,d원\n", transfer, (accountMoney - transfer));
            } else {
                System.out.println("잔액이 부족합니다.\n현재 잔액 : " + accountMoney);
                throw new IllegalArgumentException();
            }

            System.out.print("계좌번호 주인의 성함을 입력하세요 : ");
            String ownerName = sc.nextLine();
            System.out.println("accountOwner: " + ownerName);
            System.out.println("ownerName: " + ownerName);
            if (ownerName.equals(accountOwner)) {
                System.out.printf("출금 완료!\n현재 잔액 : %d원\n", (accountMoney-transfer));
                accountMap.put(accountNumber, (accountMoney-transfer));
            } else {
                throw new UserNotFoundException("일치하는 계좌의 주인이 존재하지 않습니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("입력 자료형 관련 코드 작성");
        } catch (IllegalArgumentException e) {
            System.out.println("잔액 부족 관련 코드 작성");
        } catch (Exception e) {
            System.out.println("더조은 은행에서 생각치 못한 문제가 발생했습니다.");
            e.printStackTrace();
        } finally {
            sc.close();
            System.out.println("거래 완료");
        }

        // 계좌번호 존재 여부 확인 (null 체크)
        // 출금 금액 입력 시 NumberFormatException 처리
        // 잔액 부족 시 IllegalArgumentException 발생 및 처리
        // finally에서 Scanner 종료 및 "거래 완료" 메시지





    }

}

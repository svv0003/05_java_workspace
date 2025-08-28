package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {
    public static void main(String[] args) {

        System.out.println("---게스트하우스 방문자 관리 시스템---");

        GuestHouse guest = new GuestHouse();

        /*
        Scanner 이용해서 고객 정보 저장하기
        while문 이용해서 0을 누르면 고객 정보 입력 완료
         */

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input != 0) {

        }

        // 방문자 정보 설정
        guest.setGuestName("김여행");
        guest.setCheckInDate("2025-08-27");
        guest.setRoomNumber(201);


        // static 변수 확인
        // totalCount는 최초 1회 실행이기 때문에 guest1으로 작성해서 호출하는 대신
        // GuestHouse 클래스명으로 호출하는 것이 맞다.
        // -> 자동완성에서 누락되는 것이 맞다.
        // System.out.printf("guest1이 보이는 총 방문자 수 : %d", GuestHouse.totalCount);
        // System.out.printf("guest2이 보이는 총 방문자 수 : %d", GuestHouse.totalCount);
        System.out.printf("guest1이 보이는 총 방문자 수 : %d\n", guest.totalCount);
        System.out.println();

        // 체크인 메소드 진행
        /*
        게스트별로 보이는 방문자 수가 아니라
        GuestHouse 클래스에서 자체적으로 모든 게스트하우스 사람들에게 제공하는 숫자이므로
        아래처럼 작성하면 각 순서대로 변화가 나타나는 것이 아닌
        총 방문자 수 결과가 동일하게 출력된다.

        guest.checkIn();
        guest2.checkIn();
        System.out.printf("guest1이 보이는 총 방문자 수 : %d\n",  guest.totalCount);
        System.out.printf("guest2이 보이는 총 방문자 수 : %d\n",  guest2.totalCount);
        */

        guest.checkIn();
        System.out.printf("guest1이 보이는 총 방문자 수 : %d\n",  guest.totalCount);
        System.out.println();


        // 올바른 Static 접근 방식
        System.out.println("총 방문자 수 : " + GuestHouse.totalCount);
        System.out.println();
        System.out.println("---게스트하우스 공통 정보---");
        System.out.println("게스트하우스명 : " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("WIFI 비밀번호 : " + GuestHouse.WIFI_PASSWORD);
        System.out.println();
        System.out.println("---게스트하우스 운영 규정 (static final)---");
        System.out.println("체크인  시간 : " + GuestHouse.CHECK_IN_TIME);
        System.out.println("체크아웃 시간 : " + GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일수 : " + GuestHouse.MAX_STAY_DAYS + "일");
        System.out.println("최소 숙박일수 : " + GuestHouse.MIN_STAY_DAYS + "일");
        System.out.println();
        System.out.println("---방문자별 개별 정보---");
        guest.guestInfo();     // 게스트하우스가 공통으로 제공하는 것이 아닌 방문자별로 알아야 하는 내용들




    }
}

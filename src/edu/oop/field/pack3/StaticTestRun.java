package edu.oop.field.pack3;

public class StaticTestRun {
    public static void main(String[] args) {

        // Korean 객체 생성
        Korean k1 = new Korean();       // 클래스라는 문서에 작성된 내용들을 객체로 설정한다.
                                        // 객체명 = k1
        Korean k2 = new Korean();       //

        System.out.println("k1의 nationalCode : " + k1.nationalCode);
        System.out.println("k2의 nationalCode : " + k2.nationalCode);
        System.out.println();

        // k1 이용해서 nationalCode 변경하기
        k1.nationalCode = 1;

        System.out.println("k1의 nationalCode : " + k1.nationalCode);
        System.out.println("k2의 nationalCode : " + k2.nationalCode);

        /*
        static 변수는 공용(공유) 변수이다!!
        객체가 100개 생성되어도 변수 하나로 모두가 공유한다.
        -> DB 접속 경로가 변경된다면 일일이 변경하는게 아닌 일괄 변경된다.

        static {
            nationalCode = 10;
        }
         */

        // System.out.println("우리의 조상님 : " + k1.ANCESTOR);
        System.out.println("우리의 조상님 : " + Korean.ANCESTOR);     // 사용 가능한 방법이지만 지양












    }
}

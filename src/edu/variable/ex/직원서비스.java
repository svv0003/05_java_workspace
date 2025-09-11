package edu.variable.ex;

import static edu.variable.ex.더조은회사.회사명;
import static edu.variable.ex.더조은회사.회사주소;
import static edu.variable.ex.더조은회사.사원수;
/*
import static edu.variable.ex.더나은회사.회사명;
import static edu.variable.ex.더나은회사.회사주소;
import static edu.variable.ex.더나은회사.사원수;
 */

// System.out.println("주소 : " + 직원.회사주소);
// static 작성한 필드은 앞에 클래스 명칭 없어도
// import로 static 상수 가져오기 가능하다.
// 하지만 클래스명 없이 사용할 때 변수명 중복 시
// 각 문서에 저장된 데이터가 혼합되어 출력되는 문제 발생!!
// -> 클래스명.변수명과 같은 형태로 명확히 작성하기!!

public class 직원서비스 {

    public static void 회사정보 () {
        // 더조은회사 클래스 문서와 더나은회사 클래스 문서에 모두 동일하게 static 필드가 존재한다.
        System.out.println("회사 : " + 회사명);
        System.out.println("주소 : " + 회사주소);
        System.out.println("사원 : " + 사원수 + "명");
    }

    public static void 더조은회사정보 () {
        System.out.println("회사 : " + edu.variable.ex.더조은회사.회사명);
        System.out.println("주소 : " + edu.variable.ex.더조은회사.회사주소);
        System.out.println("사원 : " + edu.variable.ex.더조은회사.사원수 + "명");
    }

    public static void 더나은회사정보 () {
        System.out.println("회사 : " + 더나은회사.회사명);
        System.out.println("주소 : " + 더나은회사.회사주소);
        System.out.println("사원 : " + 더나은회사.사원수 + "명");
    }
}



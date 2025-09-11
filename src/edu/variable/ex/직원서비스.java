package edu.variable.ex;

import static edu.variable.ex.더조은회사.사원수;
import static edu.variable.ex.더조은회사.회사주소;

public class 직원서비스 {

    public static void 회사정보 () {
        System.out.println("회사 : " + 더조은회사.회사명);
        // System.out.println("주소 : " + 직원.회사주소);
        // static 작성한 필드은 앞에 클래스 명칭 없어도
        // import로 static 상수 가져오기 가능하다.
        System.out.println("주소 : " + 회사주소);
        System.out.println("사원 : " + 사원수 + "명");
    }
}



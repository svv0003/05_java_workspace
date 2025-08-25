package edu.op.run;

import edu.op.ex.OperatorEx;

// 실행용 클래스

public class OperatorRun {
    // static 작성된 기능이나 변수명 메모리에서 프로그램을 사용할 때
    // 상시 사용처럼 메모리 공간을 차지하는 예약어

    /*
    Stack (빠른 비서같은 존재)
    - 어디에 어떤 기능이 존재하는지 주소만 기억한다.
    - 기능 (행동) 역할이 종료되면 버리고, 다른 기능을 수행할 준비한다.
    - 실질적으로 기능이 존재하는 주소만 알고 있다.

    Heap (창고지기)
    - Stack에서 주소 값으로 연결되어 들어가면 존재하는 실제 물건들의 위치
    - 누군가 클래스로 만들어진 객체를 사용하면 보관, 사용하지 않으면 공간 차지하는
        불필요한 객체나 기능으로 판단하여 버린다.
    - 실제 데이터를 저장하는 공간 (크기 다양)
    */
    public static void main(String[] args) {

        /*
        OperatorEx   코드가 작성된 클래스 이름 (= 파일명)
        op           참조 변수명
        new          프로그램 실행하기 위해 새로 생성해서 사용한다.
        OperatorEx()
        */

        // 자료형  변수명  새로운  객체 생성하겠다.
        OperatorEx op = new OperatorEx();
        // ex 폴더에서 만든 OperatorEx 파일을 가져와서 사용한다.
        // 가져온 OperatorRun 클래스 내부에서 사용할 때 op 별칭을 붙여서 사용한다.
        // 기존에 개발자가 만든 파일을 가져와서 파일 속 기능이나 변수를 활용할 것이다!

        // new OperatorEx().test();
        // op.test();
        // op.method1();
        // op.method2();
        op.method3();       // 새로운 객체를 생성해서 객체 내부에 존재하는 기능을 사용하겠다.
    }
}

package edu.op.run;

import edu.op.ex.OperatorEx;

// 실행용 클래스

public class OperatorRun {
    public static void main(String[] args) {

        /*
        OperatorEx   코드가 작성된 클래스 이름 (= 파일명)
        op           참조 변수명
        new          프로그램 실행하기 위해 새로 생성해서 사용한다.
        OperatorEx()
        */
        OperatorEx op = new OperatorEx();
        // ex 폴더에서 만든 OperatorEx 파일을 가져와서 사용한다.
        // 가져온 OperatorRun 클래스 내부에서 사용할 때 op 별칭을 붙여서 사용한다.
        // 기존에 개발자가 만든 파일을 가져와서 파일 속 기능이나 변수를 활용할 것이다!

        // new OperatorEx().test();
        // op.method1();
        op.method2();
    }
}

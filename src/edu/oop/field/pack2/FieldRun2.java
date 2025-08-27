package edu.oop.field.pack2;

import edu.oop.field.pack1.FieldEx;

// 다른 폴더에 존재하는 클래스 파일을 호출했기 때문에 package 아래에 import 구문을 작성한다.

public class FieldRun2 {
    public static void main(String[] args) {
        FieldEx f1 = new FieldEx();

        System.out.println(f1.publicValue);
        /*
        같은 패키지 + 상속을 받았을 경우에만 사용 가능하다.
        public class FieldRun2 extends FieldEx를 추가하면 FieldRun2에서 protected 사용 가능하다.
        에러메시지 - 'protectedValue'이(가) 'edu.oop.field.pack1.FieldEx'에서 protected 액세스를 가집니다.
        System.out.println(f1.protectedValue);
        */
        /*
        같은 패키지에서만 사용 가능하다.
        에러메시지 - 'defaultValueOne'이(가) 'edu.oop.field.pack1.FieldEx'에서 public이 아닙니다. 외부 패키지에서 액세스할 수 없습니다.
        System.out.println(f1.defaultValueOne);
        */
        /*
        같은 패키지에서만 사용 가능하다.
        에러메시지 - 'defaultValueTwo'이(가) 'edu.oop.field.pack1.FieldEx'에서 public이 아닙니다. 외부 패키지에서 액세스할 수 없습니다
        System.out.println(f1.defaultValueTwo);
        */
        /*
        같은 클래스에서만 사용 가능하다.
        외부 클래스 파일에서 private으로 작성된 변수명은 졉근 불가
        에러메시키 - 'privateValue'이(가) 'edu.oop.field.pack1.FieldEx'에서 private 액세스를 가집니다
        System.out.println(f1.privateValue);
         */

    }
}

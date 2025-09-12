package edu.io;

/*
String          불변
                메모리 공간 생성, 삭제 반복된다.

StringBuilder   가변
                한 공간에 데이터가 모두 들어오면 완성되는 형태
                언제든 추가 가능
 */
public class StringVsStringBuilder {

    public void method1() {

        String result = "";

        for (int i = 0; i < 1000; i++) {
            result += "숫자 : " + i + "\n";
        }
    }

    public void method2() {

        /*
        String result = new String();
        result = "";
         */
        StringBuilder add = new StringBuilder();

        for (int i = 0; i < 1000; i++) {
            add.append("숫자 : " + i + "\n");
        }
        String result = add.toString();
    }
}

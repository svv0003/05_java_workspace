package edu.array;

// 배열 기능용 클래스

import java.util.Arrays;

public class ArrayEx2 {
    // 얕은 복사   : 주소만 복사
    public void Exam1(){
        int[] arr1 = {100, 200, 300, 400};
        int[] arr2 = arr1;        // arr2는 arr1의 주소만 복사해서 값을 가져온다. (=바로가기, 파일의 위치 정보가 들어있다)

        // 배열을 한 번에 출력하는 방법
        // Arrays.toString(배열명)
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

        // 서로 다른 변수명을 이용해서 값을 변경
        arr1[0] = 1234;
        arr1[1] = 5678;

        // 얕은 복사(같은 주소를 참조하여 데이터를 사용)하는 상태이기 때문에
        // arr1, arr2 모두 동일한 출력 결과
        System.out.println("arr1, arr2에 새로운 데이터를 대입한 결과");
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));
    }
    // 깊은 복사    : 값을 똑같이 복사한 배열 / 객체 생성
    public void Exam2() {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = new int[arr1.length];      // arr1만큼의 칸 수만 설정
        int[] arr3 = new int[arr1.length];      // arr1만큼의 칸 수만 설정

        System.out.println("arr1 length: " + arr1.length);
        System.out.println("arr2 length: " + arr2.length);
        System.out.println("arr3 length: " + arr3.length);

        // 깊은 복사 방법 1번 : for문 이용
        for (int i = 0; i < arr1.length; i++) {
            // arr2의 idx 0번부터 length-1번까지
            // aar1의 idx 0번부터 length-1번까지의 값을 그대로 arr2에 복제한다.
            arr2[i] = arr1[i];
        }
        System.out.println("----복사 후 각 array length 값----");
        System.out.println("arr1 length: " + arr1.length);
        System.out.println("arr2 length: " + arr2.length);
        System.out.println("arr3 length: " + arr3.length);

        System.out.println("----복사 후 각 array 값----");
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));
        System.out.println("arr3 : " + Arrays.toString(arr3));

        // 갚은 복사 방법 2번 : System.arraycopy() 이용
        // System.arraycopy(arr1,                           원본 배열 변수명
        //                       0,                         원본 복사 시작 인덱스
        //                         arr3,                    복사해 놓을 배열명
        //                              0,                  복사 배열 삽입할 인덱스
        //                                arr1.length);     복사할 총 길이
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);

        System.out.println("----복사 후 각 array length 값----");
        System.out.println("arr1 length: " + arr1.length);
        System.out.println("arr2 length: " + arr2.length);  // for문 활용
        System.out.println("arr3 length: " + arr3.length);  // arraycopy 활용

        System.out.println("----복사 후 각 array 값----");
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));
        System.out.println("arr3 : " + Arrays.toString(arr3));
    }
}

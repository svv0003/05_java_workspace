package edu.collection.pack2.Service;

import java.util.*;

public class SetService {

    // Set  : 집합, 주머니
    // -> 기본적으로 순서 유지하지 않는다.
    // idx 없다? -> get() 메서드가 존재하지 않는다.
    // 중복데이터 저장 불가능하다. (같은 데이터가 들어오면 덮어쓰기 된다.)
    // 띄어쓰기나 공백도 모두 데이터로 칭한다.

    // set 객체 생성
    // 1. HashSet (대표)    : 처리 속도가 빠른 Set
    // 2. LinkedHashSet     : 순서를 유지하는 Set
    // 3. TreeSet           : 자동 정렬되는 Set

    public void method1(){
        // 작성법은 List ArrayList와 동일하다.
        // List에서 Set으로 변경되었을 뿐!
        Set<String> set = new HashSet<>();

        // 1. boolean add(E)    값을 넣고 T/F 형태를 지니는 기능
        set.add("카카오");
        set.add("네이버");
        set.add("라인");
        set.add("당근");

        // 2. 모두 조회 출력하는 방법은 .toString을 생략하고, 변수명만 작성 가능하다.
        System.out.println("set 공간에 들어간 데이터 순서 확인 : " + set);
        // set 공간에 들어간 데이터 순서 확인 : [카카오, 네이버, 당근, 라인]
        // 순서대로 저장 안 된다.

        set.add("배달의 민족");
        set.add("배달의 민족");
        set.add("배달의 민족");
        set.add("배 달의 민  족");
        set.add("배달의 민족   ");
        set.add("   배달의 민족");
        set.add("배달의    민족");

        System.out.println("set 공간에 들어간 데이터 중복 확인 : " + set);
        System.out.println("set 개수 : " + set.size());
        // set 공간에 들어간 데이터 중복 확인 : [배달의 민족, 카카오, 네이버, 당근, 라인,    배달의 민족, 배달의    민족, 배 달의 민  족, 배달의 민족   ]
        // set 개수 : 9
        // 띄어쓰기 공백을 포함한 데이터는 모두 다른 데이터로 판단되어 추가되었지만
        // 중복된 "배달의 민족"은 모두 덮어쓰기가 된다.

        // null     데이터가 존재하지 않는 것을 표기한다.
        // null 또한 데이터로 판단되기 때문에 1회는 들어가지만
        // null 또한 데이터 중복은 허용되지 않기 때문에 2개 이상 존재 불가!

        // 3. 순차 접근하여 모든 데이터 확인하기
        // Iterator
        // 순차적으로 접근할 수 있도록 설정된 문서 (객체, 클래스)
        // 반복자
        // 컬랙션 객체에 저장된 요소를 하나씩 순차적으로 접근하는 객체
        // boolean  hasNext();
        // 다음에 순차 접근할 요소가 있다면 true, 없다면 false
        // -> 다음에 접근할 데이터가 존재하나요?
        // -> while문을 주로 사용한다.
        // 왜?
        // List는 idx 번호가 존재하지만 Set은 데이터의 순번이나 명칭이 존재하지 않기 때문이다.

        Iterator<String> it = set.iterator();

        System.out.println("=".repeat(20) + "Set 출력하기" + "=".repeat(20));

        while (it.hasNext()){
            // set이라는 공간에 다음으로 보여줄 데이터가 존재한다면 진행하고, 없다면 멈춘다.

            System.out.println(it.next());
            // 마지막에 작성된 String 문자열 데이터 다음 공백까지 출력한다.
            // 공백 이후부터는 정말 데이터가 없는 상태이기 때문에 while문 종료된다.
        }





    }
    public void method2(){
        /*
        List, Set, Map 모두 동일하게 사용 가능

        boolean remove(E)   : 요소 제거 참/거짓 반환
        boolean contains(E) : 요소 존재 참/거짓 반환

        void clear( )       : Set에 저장된 모든 내용 제거
        set.clear*( )       : 모두 제거
        boolean isEmpty( )  : 데이터 존재 참/거짓 반환
         */

        Set<String> 과자들 = new HashSet<>();
        과자들.add("몽쉘");
        과자들.add("꼬북칩");
        과자들.add("홈런볼");
        과자들.remove("꼬북칩");
        System.out.println("과자들에서 꼬북칩이 지워졌나요? : " + 과자들.remove("꼬북칩"));
        과자들.clear();
        System.out.println("과자리스트 모두 잘 지워졌나요? : " + 과자들.isEmpty());

    }
    public void method3(){
        /*
        TreeSet
        트리 구조를 이용해서 객체를 저장하는 Set
        기본적으로 오름차순 정렬
        class 파일 전제조건은 저장되는 객체는 Comparable (=유사한, 비교) 상속 존재한다.
         */

        /*
         난수 생성
         1) Math.Random()       수학 공식 중에서 Random() 기능이 존재하는 것
         2) Random.nextInt()    랜덤 자체에서 랜덤에 관한 class 파일 자체를 만드는 것

         단순히 랜덤 숫자를 출력하기에는 2번째 방식이 더 단순하다.
         */

        Random random = new Random();           // 개발자도 알 수 없는 데이터를 담고 있는 공간 명칭

        Set<Integer> lotto = new TreeSet<>();

        // lotto 내부에 존재하는 값이 6개 미만이면 반복, 6개면 반복 중지하기
        while (lotto.size() < 6){
            // random.nextInt(45)   0 < X < 45 사이의 알 수 없는 숫자를 생성한다.
            lotto.add(random.nextInt(45)+1);

            // Random 클래스 작성하지 않고, Math 클래스를 사용했다면
            // lotto.add((int) (Math.random() *45 +1));
        }
        System.out.println("로또 번호 생성 : " + lotto);


    }
}

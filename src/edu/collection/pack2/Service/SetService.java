package edu.collection.pack2.Service;

import java.util.HashSet;
import java.util.Set;

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






    }
}

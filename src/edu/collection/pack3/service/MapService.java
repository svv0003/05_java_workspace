package edu.collection.pack3.service;

import java.util.HashMap;
import java.util.Map;

public class MapService {

    /*
    Map
    특정 키워드 (Key)를 입력하면 해당되는 상세한 값 (Value)를 얻을 수 있는 컬랙션 객체

    K:V 형식으로 구성되고, 한 쌍을 Entry라고 부른다.

    Key
    키워드 역할 (= 변수명 해당)
    중복 불가하고, 중복되는 Key를 입력하면 Value를 덮어쓰기 된다.
    순서 유지 안 된다.

    Key만 묶어서 보면 Set과 같은 특징을 지니고 있다.
    Map.keySet() / Map.EntrySet()을 제공하여 키 내에 작성된 데이터를 수정할 수 있다.

    Value
    키워드에 해당하는 상세 데이터
    Key로 인해서 모든 Value가 구분된다.
    Map.get(Key) / Map.remove(Key) 형태로 사용한다.
     */

    public void method1(){

        // HashMap 생성
        // K:M 쌍으로 되어 있기 때문에 <> 내부에도 각각 자료형을 작성해야 한다.
        Map<Integer, String> map1 = new HashMap<>();

        // 1. V put (K, V)  Map에 데이터를 추가하는 기능
        //                  Map에 추가 시 중복되는 Key가 없으면 null, 있으면 이전 Value 반환한다.

        // 인덱스 아니다. 순서 없다. 9번부터 작성해도 된다. 번호 이어서 작성 안 해도 된다.
        // 개발자가 필요로 하는 공간 명칭이고, Value 값을 담고 있을 뿐, Key의 위치는 알 수 없다.
        System.out.println(map1.put(1, "에그마요"));
        System.out.println(map1.put(2, "로티세리바베큐"));
        System.out.println(map1.put(3, "스테이크앤치즈"));
        System.out.println(map1.put(3, "스파이시쉬림프"));
        // 해당 Key와 Value가 비어있으니까 데이터가 저장해도 된다는 뜻으로 null이 출력된다.
        // 작성한 Key에 Value 값이 이미 있다면 Value 값이 들어있다는 뜻으로 이미 작성된 Value 값이 출력된다.

        // 출력은 똑같다.
        // .toString() 생략한 상태로 출력 가능하다.
        System.out.println(map1);
        // map은 json처럼 중괄호 형태   {K:M, K:M ...}
        // list은 대괄호 형태           [값, 값 ...]


        System.out.println("=".repeat(20) + "key로 Value 반환하기" + "=".repeat(20));
        // 2. V get(K)      Key에 해당하는 Value 반환하고, 일치하는 Key가 없으면 null을 반환한다.
        System.out.println("key=1 : " + map1.get(1));
        System.out.println("key=2 : " + map1.get(2));
        System.out.println("key=0 : " + map1.get(0));

        String tmap1 = map1.get(2);     // key=2에 해당하는 Value 값을 직접 확인하는 것이 아닌 tmap1에 초기화해서
        System.out.println(tmap1);      // tmap1에 담긴 값을 확인하는 방식


        System.out.println("=".repeat(20) + "Entry 개수 반환하기" + "=".repeat(20));
        // 3. int size()        Map에 저장된 Entry(K:M)의 개수를 확인한다.
        System.out.println("map1 사이즈 : " + map1.size());


        System.out.println("=".repeat(20) + "key로 Entry 제거하기" + "=".repeat(20));
        // 4. V remove(K)       Key가 일치하는 Entry를 제거하고, 일치하는 Key가 있다면 value, 없다면 null 반환한다.
        System.out.println("remove(2) : " + map1.remove(2));
        System.out.println("remove(5) : " + map1.remove(5));
        System.out.println(map1);


        // 5. void clear()      모든 Entry 제거한다.
        // 6. boolean isEmpty() 비어있는지 확인한다.
        System.out.println("=".repeat(20) + "제거 및 결과 확인하기" + "=".repeat(20));
        System.out.println("제거 전 : " + map1.isEmpty());
        map1.clear();
        System.out.println("제거 후 : " + map1.isEmpty());






    }


}

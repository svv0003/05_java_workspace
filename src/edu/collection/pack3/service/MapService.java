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

    /*
    Map에서 for문 대신 순차적으로 데이터를 출력하는 방법

    1) Map.keyset()
    2) Entry.getKey()       key만 얻어오기
       Entry.getValue()     value만 얻어오기

     */

    public void method2(){
        Map<String, String> map2 = new HashMap<>();

        map2.put("학원", "서울시 종로구");
        map2.put("집", "서울시 중구");
        map2.put("롯데타워", "서울시 송파구");
        map2.put("63빌딩", "서울시 영등포구");

        // 1번 방법
        // 향상된 for문 + Set
        for (String key : map2.keySet()) {
            System.out.printf("%-10s : %s\n", key, map2.get(key));
        }
        // 1번의 경우 key의 개수만큼 get메서드를 지속적으로 호출한다.

        // 2번 방법
        // 향상된 for문 + EntrySet
        // Map이라는 클래스 내부에 Entry라는 기능을 이용해서 key와 value를 확인하는 기능
        //
        // 향상된 for문은 항상 끝나기 전 소괄호 ) 앞에 적힌 명칭이 기준이다!!
        // 1. map2가 어디서 선언되었고, map2 명칭의 공간이 생성되었는지를 확인한다.
        // 2. Map<String, String> map2 = new HashMap<>();에서 선언된 map2의 자료형을 확인
        //      문자열, 문자열이기 때문에 아래 들어가는 자료형 또한 Map<String, String>과 동일해야 한다.
        //      map2에 존재하는 데이터들을 하나씩 꺼내서 확인할 것이기 때문이다.

        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.printf("%-10s : %s\n", entry.getKey(), entry.getValue());
        }
        // 2번의 경우 map1.entrySet()으로 key-value를 하나씩 바로 접근한다.
        // 2번이 성능상 더 효율적이고, 실무적으로 더 유용하다.
    }

}

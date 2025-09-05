package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class MemberPointManager {

    // 필드
    Map<String, Integer> pointMap = new HashMap<String, Integer>();

    // 메서드
    void registerMember(String memberId) {
        if (pointMap.get(memberId) != null) {
            System.out.println("이미 존재하는 ID입니다.");
        } else {
            pointMap.put(memberId, 0);
            System.out.println(memberId + " 신규 회원으로 등록되었습니다.");
        }
    }

    void earnPoints(String memberId, int points){
        if (pointMap.get(memberId) == null) {
            System.out.println("존재하지 않는 회원입니다.");
        } else {
            int point = pointMap.get(memberId);
            point += points;
            pointMap.put(memberId, point);
            System.out.println("포인트가 적립되었습니다.\n현재 포인트 : " +  pointMap.get(memberId));
        }
    }

    void usePoints(String memberId, int points) {
        if  (pointMap.get(memberId) == null) {
            System.out.println("존재하지 않는 회원입니다.");
        } else if (pointMap.get(memberId) >= points) {
            System.out.printf("%s 님이 %d 포인트를 사용했습니다.\n남은 포인트 : %d\n", memberId, points, pointMap.get(memberId)-points);
            pointMap.put(memberId, pointMap.get(memberId) - points);
        } else System.out.println("포인트가 부족합니다.\n현제 포인트 : " +  pointMap.get(memberId));
    }

    void displayAllMembers(){
        System.out.println("=".repeat(20) + "전체 회원 포인트 조회" + "=".repeat(20));
        System.out.println(pointMap);
    }

    public void method(){
        pointMap.put("user01", 1000);
        pointMap.put("user02", 1500);
        pointMap.put("user03", 500);
    }
}

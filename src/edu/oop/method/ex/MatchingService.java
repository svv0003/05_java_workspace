package edu.oop.method.ex;

import java.util.Scanner;

// 결혼정보회사 회원 관리 서비스 클래스

public class MatchingService {

    private Scanner sc = new Scanner(System.in);

    private MatchingMember m =  new MatchingMember();

    public void displayMenu() {
        int input;

        while (true) {
            System.out.println("\n=== 더조은 결혼정보회사 관리 시스템 ===");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 정보 확인");
            System.out.println("3. 회원 정보 수정");
            System.out.println("0. 프로그램 종료");
            System.out.println("=====================================");

            System.out.print("메뉴 선택: ");
            input = sc.nextInt();

            switch (input) {
                case 1: registerNewMember(); break;
                case 2: viewMemberInfo(); break;
                case 3: updateMemberDetails(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    // memberName Service 아래에 객체 하나라도 필드형태로 만들기
    // --- 기능 메서드 ---
    public MatchingMember registerNewMember() {
        System.out.print("아이디 : ");
        String newId = sc.next();
        System.out.print("이름 : ");
        String newName = sc.next();
        System.out.print("나이 : ");
        int newAge = sc.nextInt();
        System.out.print("성별 : ");
        char newGender = sc.next().charAt(0);
        System.out.print("직업 : ");
        String newJob = sc.next();

        if (checkAgeValid(newAge)) {
            MatchingMember.totalMemberCount++;
            System.out.println(m.getMemberName() + "님이 회원가입하셨습니다. (회원ID: " + m.getMemberId() + ")");
        } else {
            System.out.println("가입 연령 기준(" + MatchingMember.MIN_AGE_LIMIT + "세 ~ " + MatchingMember.MAX_AGE_LIMIT + "세)에 맞지 않아 등록이 취소됩니다.");
            return null;
        }
        return new MatchingMember(newId, newName, newAge, newGender, newJob);
    }

    /**
     * 나이를 확인하는 기능
     * @param newAge    입력한 나이를 매개변수로 사용한다.
     * @return          회사에서 정한 나이 범위에 해당하지 않는다면 가입 불가
     */
    public boolean checkAgeValid(int newAge) {
        return newAge >= MatchingMember.MIN_AGE_LIMIT && m.getAge() <= MatchingMember.MAX_AGE_LIMIT;
    }

    public void viewMemberInfo() {
        System.out.println("--- 회원 정보 ---");
        System.out.printf("ID: %s, 이름: %s, 나이: %d세, 성별: %c, 직업: %s, 매칭점수: %d점\n",
                m.getMemberId(), m.getMemberName(), m.getAge(), m.getGender(), m.getJob(), m.getMatchingScore());
    }


    private void updateMemberDetails() {
        System.out.println("어떤 정보를 수정하시겠습니까?");
        System.out.println("1 - 이름\n2 - 나이\n3 - 직업");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("이름을 입력하세요 : ");
                String newName = sc.nextLine();
                m.setMemberName(newName);
                System.out.println("이름이 성공적으로 변경되었습니다.");
                break;
            case 2:
                System.out.print("나이을 입력하세요 : ");
                String newAge = sc.nextLine();
                m.setAge(Integer.parseInt(newAge));
                System.out.println("나이가 성공적으로 변경되었습니다.");
                break;
            case 3:
                System.out.print("직업을 입력하세요 : ");
                String newJob = sc.nextLine();
                m.setJob(newJob);
                System.out.println("직업이 성공적으로 변경되었습니다.");
                break;
            default:
                System.out.println("수정할 정보를 잘못 선택하셨습니다.");
        }
        System.out.println("---수정이 반영된 회원 정보---");
        System.out.printf("%s / %s / %c성 / %s", m.getMemberName(),  m.getAge(), m.getGender(), m.getJob());
    }


}
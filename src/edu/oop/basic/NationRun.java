package edu.oop.basic;

// Nation 클래스 활용한 객체 생성 및 조작 실습

public class NationRun {
    public static void main(String[] args) {
        Nation n1 = new Nation();

        // 자료형 앞에 private이 아닌 public으로 작성했을 경우 아래와 같은 구문 수행 가능
        // 은행 예시로 들었을 때 창고에 직접 들어가서 돈을 저장

        /*
        n1.name = "홍길동";
        n1.age = 25;
        n1.gender = '남';
        System.out.printf("이름은 %s이고, %d세 %c성입니다.",  n1.name, n1.age, n1.gender);
        */

        // 기본 생성자 활용
        // n1.setName = "홍길동";  <- setName(String name) 형태가 매개변수로 값을 저장하는 형태
        n1.setName("홍길동");
        n1.setAge(25);
        n1.setGender('남');
        n1.setTel("010-1234-1234");
        n1.setAddress("서울시 강남구");
        System.out.printf("이름은 %s이고, %d세 %c성입니다.\n",  n1.getName(), n1.getAge(), n1.getGender());

        // 필수 생성자 활용
        Nation n2 = new Nation("이영희", 17, '여', "070312-4567890", "010-1234-4321", "부산시 해운대구");
        System.out.println(n2.getName());
        System.out.println(n2.getAge());
        System.out.println(n2.getGender());
        System.out.println(n2.getTel());
        System.out.println(n2.getAddress());

        // 필수 생성자로 n3 생성한 후 setter 사용해서 정보 설정하기
        Nation n3 = new Nation("박민수", 42, '남', "820525-1987654", "010-1234-5678", "대구시 중구");

        // 자기소개 기능 활용해서 모든 국민 자기소개 확인하기
        n1.introduce();
        n2.introduce();
        n3.introduce();

        // 납세의무 확인하기
        n1.납세의무();
        n2.납세의무();
        n3.납세의무();

        // 한국어 능력 및 복지 혜택 확인하기
        n1.speakKorean();
        n1.welfare();
        n2.speakKorean();
        n2.welfare();
        n3.speakKorean();
        n3.welfare();







    }
}

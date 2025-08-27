package edu.oop.field.pack1;

// 실생활로 비유하는 접근 제한자

public class HouseEx {
    // public - 집 주소 (누구나 알 수 있음)
    //          사용자 닉네임
    public String address = "서울시 종로구";

    // protected - 가정사 (가족, 친척만 알 수 있음)
    //          게임 레벨, 레벨업 기능
    protected String familySecret = "아버지의 고향은?";

    // default - 동네 이야기 (한 동네 (= 폴더) 사람들만 알 수 있음)
    //          내부적으로만 사용하는 코드 기능
    String neighborNews = "새 식구가 이사 왔다.";

    // private - 개인사 (본인만 알 수 있음)
    //          계좌 비밀번호, 외부에서 함부로 건드리면 안 되는 중요한 번호
    private String mySecret = "일기장 암호";


}

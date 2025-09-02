package edu.inheritance.ex3;

public class GoogleServiceRun {
    public static void main(String[] args) {

        // 1. Gmail 객체 생성
        Gmail gmail = new Gmail("user@gmail.com","홍길동","개인계정",150,8);


        // 2. YouTube 객체 생성
        YouTube youTube = new YouTube("user1@gmail.com","박길동","개인계정",50,true);


        // 3. 다형성을 활용한 배열 생성
        // 부모클래스로 자식들을 [] 배열 처리해서 리스트로 나열 가능 = 나열된 자식클래스들
        // for(부모클래스 하나씩출력할변수명 : 부모클래스 배열 변수명) {
        //      하나씩출력할변수명.부모클래스기능들();
        // }
        GoogleService[] 서비스들 = {gmail, youTube};

        /*
        System.out.println("=== 구글 서비스 사용자 정보 ===");
        gmail.showUserInfo();
        youTube.showUserInfo();
        */

        for(GoogleService 하나씩공통기능확인하기 : 서비스들){
            System.out.println("=== 구글 서비스 사용자 정보 ===");
            하나씩공통기능확인하기.showUserInfo();

            System.out.println("\n=== 로그인 ===");
            하나씩공통기능확인하기.login();

            System.out.println("\n=== 서비스별 검색 ===");
            하나씩공통기능확인하기.search();
        }

        /*
        System.out.println("\n=== 로그인 ===");
        gmail.login();
        youTube.login();

        System.out.println("\n=== 서비스별 검색 ===");
        gmail.search();
        youTube.search();
        */

        System.out.println("\n=== 서비스별 고유 기능 ===");
        gmail.sendEmail();

        youTube.uploadVideo();
        youTube.subscribe();
        youTube.watchAd();

        System.out.println("구독자 수 :" + youTube.get구독자수() + "명");

        System.out.println("\n=== 로그아웃 ===");
        gmail.logout();
        youTube.logout();

    }
}
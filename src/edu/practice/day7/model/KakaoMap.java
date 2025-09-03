package edu.practice.day7.model;

public class KakaoMap extends KakaoService {
    private String currentLocation;
    private boolean isGPSEnabled;


    public KakaoMap() {
        super();
        this.currentLocation = "위치 정보 없음";
        this.isGPSEnabled = false;
    }

    public KakaoMap(String serviceName, String userId, String userNickname, String currentLocation) {
        super(serviceName, userId, userNickname,"MAP");
        this.currentLocation = currentLocation;
        this.isGPSEnabled = false;
    }

    public KakaoMap(String serviceName, String userId, String userNickname, String currentLocation, boolean isGPSEnabled) {
        super(serviceName, userId, userNickname,"MAP");
        this.currentLocation = currentLocation;
        this.isGPSEnabled = isGPSEnabled;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    public boolean isGPSEnabled() {
        return isGPSEnabled;
    }
    public void setGPSEnabled(boolean GPSEnabled) {
        isGPSEnabled = GPSEnabled;
    }
    public void searchLocation(String location) {

        System.out.println("'" + location + "' 검색 결과를 표시합니다.");
    }
    public void findRoute(String start, String end) {

        System.out.println(start + "에서 " + end + "까지의 경로를 찾습니다.");
        System.out.println("예상 소요시간: 25분, 거리: 8.5km");
    }
    public void enableGPS() {
        this.isGPSEnabled = true;
        System.out.println("GPS를 활성화했습니다. 현재 위치: " + currentLocation);
    }

    @Override
    public void showUserInfo() {
        super.showUserInfo();
        System.out.println("현재 위치: " + currentLocation);
        System.out.println("GPS 상태: " + (isGPSEnabled ? "활성화" : "비활성화"));
    }

    @Override
    public void startService() {
        System.out.println("카카오맵을 시작합니다. 길찾기 서비스가 준비되었습니다!");
        if (isGPSEnabled) {
            System.out.println("GPS가 활성화되었습니다.");
        }
    }

    @Override
    public void stopService() {
        System.out.println("카카오맵을 종료합니다. 경로 기록을 저장했습니다.");
    }

    @Override
    public String getServiceType() {
        return "navigation";
    }

    @Override
    public void performSpecialAction() {
        System.out.println("길찾기 기능을 실행합니다.");
        System.out.println("최적의 경로를 안내해드리겠습니다.");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("[카카오맵 알림] " + message);
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("[카카오맵에서 알림 수신] " + message);
    }

    public void updateLocation(String 새로운장소) {
        System.out.println("위치가 새롭게 변경되었습니다 : " + 새로운장소);
    }
}
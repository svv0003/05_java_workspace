package edu.practice.day7;

public class KakaoMap extends KakaoService {

    // 필드
    private String currentLocation;
    private boolean isGPSEnabled;


    // 생성자 / getter / setter
    public KakaoMap() {
    }
    public KakaoMap(String serviceName, String userId, String userNickname, boolean isLoggedIn) {
        super(serviceName, userId, userNickname, isLoggedIn);
    }
    public KakaoMap(String serviceName, String userId, String userNickname, boolean isLoggedIn, String currentLocation, boolean isGPSEnabled) {
        super(serviceName, userId, userNickname, isLoggedIn);
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


    // 추상 메서드
    public void startService(){
        System.out.println("카카오맵을 시작합니다. 길찾기 서비스가 준비되었습니다!");
        if (isGPSEnabled) {
            System.out.println("GPS가 활성화되었습니다.");
        }
    }
    public void stopService(){
        System.out.println("카카오맵을 종료합니다. 경로 기록을 저장했습니다.");
    }
    public String getServiceType(){
        return "NAVIGATION";
    }
    public void performSpecialAction() {
    }


    // 메서드 오버라이딩
    @Override
    public void sendNotification(String message){
        System.out.println("[카카오맵 알림] " + message);
    }


    // 고유 메서드
    public void updateLocation(String newLocation){}

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



}

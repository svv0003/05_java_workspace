package edu.oop.field.pack3.ex;

public class GuestHouse {

    /* 필드 */
    // static 붙은 필드는 프로그램 실행 시 static 메모리 영역에 할당된다.

    /*
    static 필드 앞에 public을 작성하는 이유
    -> 최초 1회만 실행되기 때문에 누구든지 공유할 수 있도록 하는게 목적인 예약어
     */

    // 메서드 기본 생성자
    // 작성하지 않아도 자동으로 생성된다.
    // 하지만 매개변수 존재하는 필수 생성자를 작성할 경우에는
    // 필히 기본 생성자 또한 작성해야 한다.
    public static int totalCount = 0;       // 전제 방문자 수 (모든 방문자 공유하도록)

    // static + final
    public static final String GUESTHOUSE_NAME = "서울 게스트하우스";
    public static final String WIFI_PASSWORD = "welcome2025";
    public static final String CHECK_IN_TIME = "15:00";
    public static final String CHECK_OUT_TIME = "11:00";
    public static final String MAX_STAY_DAYS = "30";        // 최대 숙박 가능 일자
    public static final String MIN_STAY_DAYS = "1";         // 최소 숙박 가능 일자

    private String guestName;       // 방문자명
    private String checkInDate;     // 체크인 날짜
    private int roomNumber;      // 방 번호


    // 초기화 블록
    // 객체 생성 시 필드를 {} 내부의 값으로 초기화한다.

    {
        guestName = "익명 방문자";
        checkInDate = "2025-08-28";
        roomNumber = 101;
    }


    // static 초기화 블록
    // -> static 최초 1회만 읽는다.

    static {
        totalCount = 0;             // 시스템 시작 시 방문자 수 초기화한다.
        System.out.println("---" + GUESTHOUSE_NAME + " 시스템 시작---");
    }

    /*
    초기화 시
    1순위로 초기화 : static 변수들이 먼저 초기화된다.
    public static final String GUESTHOUSE_NAME = "서울 게스트하우스";

    2순위로 초기화 : static {} 블록이 나중에 실행된다.
                  + 만약 변수 선언 전에 {} 블록을 작성하면 오류 발생한다.
    static {
        totalCount = 0;             // 시스템 시작 시 방문자 수 초기화한다.
        System.out.println("---" + GUESTHOUSE_NAME + " 시스템 시작---");
    }

    {} 블록 형태의 경우
    여러 줄의 실행문을 포함해서 작성한다.
    복잡한 로직, 시스템 메세지 출력을 포함해야 할 경우 사용한다.
    복잡한 로직이 필요하지 않고, 단순 값 할당만 진행할 경우에는 {} 형태를 작성할 필요 없다.

     */

    // 메서드 setter - private 대신 데이터를 보관하는 용도

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // 메서드 getter - private 대신 데이터를 전달하는 용도

    public String getGuestName() {
        return guestName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    // 메서드
    // 개발자가 필요로 하는 기능 작성한다.
    // 추후 class 파일을 분리하여 작성할 예정이다.

    // 체크인 메서드
    public void checkIn(){
        totalCount++;
        System.out.printf("%s님이 %d호실에 체크인하였습니다.\n", guestName, roomNumber);
    }

    // 방문자 정보 출력 메서드
    public void guestInfo(){
        System.out.println("------------------------");
        System.out.println("방문자명 : " + guestName);
        System.out.println("체크인 날짜 : " + checkInDate);
        System.out.println("객실 번호 : " + roomNumber + "호");
    }




}

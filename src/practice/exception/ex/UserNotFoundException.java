package practice.exception.ex;

public class UserNotFoundException  extends Exception {
    public UserNotFoundException() {
        System.out.println("존재하지 않는 아이디입니다.");
    }

    public UserNotFoundException(String msg) {
        super(msg);
    }
}
package edu.practice.day3;

public class Practice3 {
    private String accountHoler;
    private String accountNumber;
    private long balance;
    private String password;
    private int transactionCount;

    public Practice3() {
    }

    public Practice3(String accountNumber, long balance, int transactionCount) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionCount = transactionCount;
    }

    public void setAccountHoler(String accountHoler) {
        this.accountHoler = accountHoler;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public String getAccountHoler() {
        return accountHoler;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public int getTransactionCount() {
        return transactionCount;
    }


/*
System.out.println(+ "님이 " + + "원 입금하셨습니다. 현재 잔액: " + + "원");
System.out.println("비밀번호가 일치하지 않습니다.");
System.out.println("잔액이 부족합니다.");
System.out.println(+ "님이 " + + "원 출금하셨습니다. 현재 잔액: " +  + "원");
System.out.println("비밀번호가 일치하지 않습니다.");
System.out.println("잔액이 부족합니다.");
System.out.println( + "님이 " +  + "님께 " + + "원 송금했습니다.");
System.out.println( + "님 현재 잔액: " +  + "원");
System.out.println( + "님 현재 잔액: " + + "원");
System.out.println("=== " + + "님 총 거래 횟수 ===");
System.out.println("총 " +  + "회 거래를 하셨습니다.");
System.out.println("=== " +  + "님 계좌 정보 ===");
System.out.println("계좌번호: " +);
System.out.println("잔액: " +  + "원");
System.out.println("총 거래 횟수: " + + "회");
 */


    public void transfer(String pw, long amount, String receiver){
        if (!password.equals(pw)){              // 비밀번호 틀리다면
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        } else {
            if (amount > balance) {
                System.out.println("잔액이 부족합니다.");
                return;
            } else {
                balance -= amount;
                System.out.println(accountHoler + "님이 " + receiver + "님께 " + amount + "원 송금했습니다.");
                System.out.println(accountHoler + "님 현재 잔액 : " + balance + "원");
                System.out.println(receiver + "님 현재 잔액 : " + amount + "원");
                transactionCount++;
            }
        }
    }

    public void method3(String pw, long amount, String receiver){
        System.out.println("=== " + accountHoler + "님 계좌 정보 ===");
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
        System.out.println("총 거래 횟수: " + transactionCount + "회");

        transfer(pw, amount, receiver);

        System.out.println("=== " + accountHoler + "님 총 거래 횟수 ===");
        System.out.println("총 " + transactionCount + "회 거래를 하셨습니다.");
    }



}

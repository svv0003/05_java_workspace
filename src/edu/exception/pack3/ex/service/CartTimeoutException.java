package edu.exception.pack3.ex.service;

import edu.exception.pack3.ExceptionEx3;

/*
개발자가 필요에 의해 강제 중단 상황을 문서로 만들고,
강제 중단 상황에 따른 대처를 service에서 진행한다.

ex) 티켓 예매 사이트에서 동일 아이디로
    다른 주소 여러 곳에 접속되어 있는 것을 발견한다면
    동일한아이디동시접속Exception extends Exception
    -> 동일한 아이디가 여러 곳에 접속한 것을 확인했으니
        모든 계정에서 로그아웃 처리를 진행합니다.를 설정 가능하다.

ex) 결제 처리 = 결제 시간 만료 / 다른 사람이 먼저 결제했고, 상품이 품절됐을 때 결제 기능 중단 처리
    쿠폰 적용
    은행 송금 (잔고보다 더 큰 금액을 이체할 때 보내기 기능 자체 중지한다.)
    등 정기적인 보안 감시와 해킹에 대한 보안 방지, 회사 규칙 강제 등에 활용한다.
 */

public class CartTimeoutException extends Exception {

    public CartTimeoutException(String message) {
        // 나중에 CartTimeoutException("작성한 내용")대로 출력할 수 있게 설정한다.
        super(message);
    }

}

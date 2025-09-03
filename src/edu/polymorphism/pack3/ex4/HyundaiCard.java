package edu.polymorphism.pack3.ex4;

// 현대카드       상속크래스         구현할기능들
class HyundaiCard extends CreditCard implements CardMethods {
    public HyundaiCard(String holderName, String cardNumber) {
        super("현대카드", holderName, cardNumber);
    }

    @Override
    public void showBenefits() {
        System.out.println("🟠 현대카드 혜택:");
        System.out.println("   - 영화관 50% 할인");
        System.out.println("   - 음식점 10% 할인");
        System.out.println("   - 해외결제 수수료 면제");
    }

    @Override
    public int calculateDiscount(int amount) {
        int discount = (int)(amount * 0.1); // 10% 할인
        System.out.println("🟠 현대카드: " + discount + "원 할인");
        return discount;
    }

    @Override
    public int getPointRate() {
        return 2; // 100원당 2포인트 (높은 적립률)
    }
}
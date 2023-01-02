package hello.springcore.discount;

import hello.springcore.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액: 만약 해당 멤버의 할인 금액이 1,000원이라면 1,000원을
     * 리턴해줍니다.
     */
    int discount(Member member, int price);
}

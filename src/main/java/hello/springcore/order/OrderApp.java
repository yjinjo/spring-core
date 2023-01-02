package hello.springcore.order;

import hello.springcore.member.Grade;
import hello.springcore.member.Member;
import hello.springcore.member.MemberService;
import hello.springcore.member.MemberServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        // 객체 자체를 출력하면 Order 클래스에서 작성한 toString 메서드가 출력됩니다.
        System.out.println("order = " + order);
    }
}

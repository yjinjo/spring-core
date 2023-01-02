package hello.springcore.member;

public interface MemberRepository {

    void save(Member member); // 회원 저장

    Member findById(Long memberId); // 회원의 Id로 회원을 찾음
}
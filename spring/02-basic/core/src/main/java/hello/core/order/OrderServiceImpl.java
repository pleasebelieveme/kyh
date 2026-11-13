package hello.core.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import lombok.RequiredArgsConstructor;

// BeanDefinitionStoreException
// @Component("service")
@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	private final MemberRepository memberRepository;
	// final은 무조건 값이 할당되어야 하기에 final을 지운다. -> 생성자주입으로 바꾸면 다시 final 적용
	private final DiscountPolicy discountPolicy;


	// // @RequiredArgsConstructor가 아래의 코드를 생성해줌
	// // 생성자가 1개라면 @Autowired가 자동으로 적용
	// // discountPolicy에 fix가 들어올지 rate가 들어올맂 impl은 모른다 -> 동적인 객체 인스턴스 의존 관계
	// @Autowired
	// public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
	// 	// System.out.println("memberRepository = " + memberRepository);
	// 	// System.out.println("discountPolicy = " + discountPolicy);
	// 	this.memberRepository = memberRepository;
	// 	this.discountPolicy = discountPolicy;
	// }

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member findMember = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(findMember, itemPrice); // 누군가 구현체를 대신 만들어서 주입시켜줘야 한다!!
		return new Order(findMember.getId(), itemName, itemPrice, discountPrice);
	}

	// 수정자 주입 방식은 필드의 final이 붙으면 에러
	// @Autowired
	// public void setMemberRepository(MemberRepository memberRepository) {
	// 	this.memberRepository = memberRepository;
	// }
	// @Autowired
	// public void setDiscountPolicy(DiscountPolicy discountPolicy) {
	// 	this.discountPolicy = discountPolicy;
	// }


	// 테스트 용도
	public MemberRepository getMemberRepository() {
		return memberRepository;
	}
}

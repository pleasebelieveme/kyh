package hello.core.discount;

import org.springframework.stereotype.Component;

import hello.core.member.Grade;
import hello.core.member.Member;

// NoUniqueBeanDefinitionException.class
// expected single matching bean but found 2: fixDiscountPolicy,rateDiscountPolicy
// @Component
public class FixDiscountPolicy implements DiscountPolicy {

	private int discountFixAmount = 1000;

	@Override
	public int discount(Member member, int price) {

		// Enum타입은 == 쓰는게 맞음
		if(member.getGrade()== Grade.VIP) {
			return discountFixAmount;
		} else {
			return 0;
		}
	}
}

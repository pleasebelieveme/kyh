package hello.core.order;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemoryMemberRepository;

class OrderServiceImplTest {

	@Test
	void createOrder() {
		OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
		orderService.createOrder(1L, "itemA", 10000);
		// 생성(create)만 테스트하고 싶어도 MemberRepository와 DiscountPolicy가 필요하기에 NullPointException 발생

		// TODO: 멤버만들고 파라미터 넣어주고 테스트 완료하기
	}

}
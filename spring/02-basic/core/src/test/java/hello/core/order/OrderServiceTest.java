package hello.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;

public class OrderServiceTest {

	MemberService memberService;
	OrderService orderService;

	@BeforeEach
	public void beforeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
		orderService = appConfig.orderService();
	}

	@Test
	void createOrder() {
		// given
		Long memberId = 1L;
		Member findMember = new Member(memberId, "memberA", Grade.VIP);
		memberService.join(findMember);

		// when
		Order order = orderService.createOrder(findMember.getId(), "itemA", 10000);

		// then
		Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
	}

	// @Test
	// void fieldInjectionTest() {
	// 	OrderServiceImpl orderService = new OrderServiceImpl();
	// 	orderService.createOrder(1L, "itemA", 10000);
	// 	// 필드주입은 테스트할 방법이 없다. setRepository 필요
	// }
}

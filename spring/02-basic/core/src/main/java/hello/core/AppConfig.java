package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

	// @Bean memberService -> new MemoryMemberRepository()
	// @Bean orderService -> new MemoryMemberRepository()


	// call AppConfig.memberService
	// call AppConfig.memberRepository
	// call AppConfig.memberRepository
	// call AppConfig.orderService
	// call AppConfig.memberRepository
	// -> 왜 memberRepository가 한번만 호출되지?

	@Bean
	public MemberService memberService() {
		//1번
		System.out.println("call AppConfig.memberService");
		// 생성자 주입
		return new MemberServiceImpl(memberRepository());
	}

	@Bean
	public MemberRepository memberRepository() {
		//2번? 3번?
		System.out.println("call AppConfig.memberRepository");
		return new MemoryMemberRepository();
	}

	@Bean
	public  OrderService orderService() {
		//1번
		System.out.println("call AppConfig.orderService");
		return new OrderServiceImpl(memberRepository(),  discountPolicy());
	}

	@Bean
	public DiscountPolicy discountPolicy() {
		// return new FixDiscountPolicy();
		return new RateDiscountPolicy();
	}
}

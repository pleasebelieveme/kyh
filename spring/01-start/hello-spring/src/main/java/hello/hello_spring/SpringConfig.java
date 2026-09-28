package hello.hello_spring;

import javax.sql.DataSource;
import javax.swing.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hello_spring.repository.JdbcMemberRepository;
import hello.hello_spring.repository.JdbcTemplateMemberRepository;
import hello.hello_spring.repository.JpaMemberRepository;
import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import hello.hello_spring.service.MemberService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Configuration
public class SpringConfig {

	/* java, jdbcTemplate 설정
	@Autowired DataSource dataSource;

	@Autowired
	public SpringConfig(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	*/

	/* jpa 설정
	// @PersistenceContext // 스펙에서는 이렇게 받으라고 설명.
	EntityManager em;

	@Autowired
	public SpringConfig(EntityManager em) {
		this.em = em;
	}
	*/

	private final MemberRepository memberRepository;

	@Autowired
	public SpringConfig(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Bean
	public MemberService memberService() {
		return new MemberService(memberRepository); // memberRepository()는 메서드 호출
	}

	// @Bean
	// public MemberRepository memberRepository() {
	// 	// return new MemoryMemberRepository();
	// 	// return new JdbcMemberRepository(dataSource);
	// 	// return new JdbcTemplateMemberRepository(dataSource);
	// 	return new JpaMemberRepository(em);
	// }
}

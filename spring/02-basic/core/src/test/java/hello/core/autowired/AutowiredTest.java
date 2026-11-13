package hello.core.autowired;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.de.siegmar.fastcsv.util.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.core.member.Member;

public class AutowiredTest {

	@Test
	void AutowiredOption() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
	}

	static class TestBean {

		// 기본값 true, 자동 주입할 대상이 없으면 수정자 메서드 자체가 호출 안됨
		@Autowired(required = false)
		public void setNoBean1(Member noBean1) {
			System.out.println("noBean1 = " + noBean1);
		}

		// null이어도 호출은 됨
		@Autowired(required = false)
		public void setNoBean2(@Nullable Member noBean2) {
			System.out.println("noBean2 = " + noBean2);
		}

		// Optional로 호출됨
		@Autowired
		public void setNoBean3(Optional<Member> noBean3) {
			System.out.println("noBean3 = " + noBean3);
		}
	}
}

package cn.mldn.zlg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpDemo {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/zlg-di.xml");
		System.out.println(ctx.getBean("emp"));
	}
	
}

package cn.mldn.zlg.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.zlg.ioc.service.IMessage;

public class TestMessageDemo {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/zlg-ioc.xml");
		IMessage message=ctx.getBean("messageImpl",IMessage.class);
		System.out.println(message.Echo("zhanglongge"));
	}
	
}

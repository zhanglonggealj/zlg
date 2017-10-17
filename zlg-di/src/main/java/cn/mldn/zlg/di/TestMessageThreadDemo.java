package cn.mldn.zlg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.zlg.di.vo.Message;

public class TestMessageThreadDemo {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/zlg-di.xml");
		for(int x=0;x<3;x++) {
			new Thread(()-> {
				Message msg=ctx.getBean("message",Message.class);
				System.out.println(Thread.currentThread().getName()+",msg = "+msg);
			}).start();
			
		}
	}
	
}

















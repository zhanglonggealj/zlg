package cn.mldn.zlg.di;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.zlg.di.vo.Dept;

public class TestDeptDemo1 {
	
	public static void main(String[] args) {
		//启动Spring上下文，在以后的实际开发过程之中，这一启动过程由WEB容器负责
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/zlg-di.xml");
		Dept dept=ctx.getBean("deptObj",Dept.class);
		System.out.println(dept);
		System.out.println(Arrays.toString(dept.getEmps()));
		System.out.println(Arrays.toString(dept.getInfos()));
	}
	
}

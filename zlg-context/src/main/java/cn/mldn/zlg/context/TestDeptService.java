package cn.mldn.zlg.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.zlg.context.service.IDeptService;
import cn.mldn.zlg.context.vo.Dept;

public class TestDeptService {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/zlg-dao.xml","spring/zlg-service.xml");
		IDeptService deptService=ctx.getBean("deptService",IDeptService.class);
		Dept dept=new Dept();
		dept.setDeptno(110L);
		dept.setDname("zahnglongge");
		System.out.println(deptService.add(dept));
	}
}
    
package cn.mldn.zlg.context;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.zlg.context.service.IDeptService;
import cn.mldn.zlg.context.vo.Dept;
import junit.framework.TestCase;
@ContextConfiguration(locations= {"classpath:spring/zlg-context.xml"})//进行资源文件定位
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDeptService1 extends TestCase {
	@Resource
	private IDeptService deptService;//直接注入业务对象
	@Test
	public void testAdd() {
		Dept dept=new Dept();
		dept.setDeptno(110L);
		dept.setDname("张龙阁");
		TestCase.assertTrue(this.deptService.add(dept));
	}

}


























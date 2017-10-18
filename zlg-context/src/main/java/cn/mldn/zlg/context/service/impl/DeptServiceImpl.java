package cn.mldn.zlg.context.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.zlg.context.dao.IDeptDAO;
import cn.mldn.zlg.context.service.IDeptService;
import cn.mldn.zlg.context.vo.Dept;

@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO;//定义IDeptDAO接口对象
	public void setDeptDAO(IDeptDAO deptDAO) {//该对象要通过外部进行注入
		this.deptDAO=deptDAO;//数据层对象的实例化控制完全由Spring负责处理
	}
	@Override
	public boolean add(Dept dept) {
		// TODO Auto-generated method stub
		System.out.println("***Dept业务层调用***");
		return this.deptDAO.doCreate(dept);
	}

}

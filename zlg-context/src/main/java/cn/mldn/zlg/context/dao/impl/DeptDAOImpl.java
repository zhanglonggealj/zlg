package cn.mldn.zlg.context.dao.impl;

import org.springframework.stereotype.Repository;

import cn.mldn.zlg.context.dao.IDeptDAO;
import cn.mldn.zlg.context.vo.Dept;

@Repository
public class DeptDAOImpl implements IDeptDAO {

	@Override
	public boolean doCreate(Dept dept) {
		// TODO Auto-generated method stub
		System.out.println("【数据层-DeptDAOImpl】增加新部门："+dept);
		return true;
	}

}

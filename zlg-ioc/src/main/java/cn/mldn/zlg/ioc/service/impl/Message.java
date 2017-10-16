package cn.mldn.zlg.ioc.service.impl;

import cn.mldn.zlg.ioc.service.IMessage;

public class Message implements IMessage {

	@Override
	public String Echo(String msg) {
		// TODO Auto-generated method stub
		return "【ECHO】"+msg;
	}

}

package main.com.jeyson.factory.simpleFactory;

import main.com.jeyson.factory.factorymethod.Cellphone;
import main.com.jeyson.factory.factorymethod.IPhone;
import main.com.jeyson.factory.factorymethod.Samsung;

/**
 *
 * @Message:  created by Jeyson on 2016年9月20日
 * 
 * @Description: 简单工厂
 *     实现创建对象，创建时不需要再知道具体实现类
 *     客户端不再跟实现类打交道。都交给工厂来做
 *     
 *     简化了调用者工作
 *     
 *     对于增加新产品比较无奈，必须修改原有代码。
 */
public class SimplePhoneFactory {
    
	public static Cellphone getCellphone(String type){
		if("iPhone".equals(type)){
			return new IPhone();
		}else if("Samsung".equals(type)) {
			return new Samsung();
		}else {
			throw new RuntimeException("没有正确的手机类型创建");
		}
	}
}


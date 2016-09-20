package main.com.jeyson.singleton;

import java.io.Serializable;

/**
 *
 * @Message:  created by Jeyson on 2016年9月19日
 * 
 * @Description:懒汉式单例模式（序列化）
 *      为测试反序列化破解单例模式
 * 
 *   
 */
public class SingletonDemo06 implements Serializable{
	/**
	 * 加载时就不把对象创建出来--懒汉式
	 * 类初始化时天然的是线程安全的
	 */
	private static SingletonDemo06 instance;
	private SingletonDemo06(){
		
	}
	//方法同步，并发效率低（如果不同步，并发量高的时候可能创建多个对象）
	public static synchronized SingletonDemo06 getInstance(){
		if(instance==null){
			instance=new SingletonDemo06();
		}
		return instance;
	}
	
//	/**
//	 * 防破解反序列化的方案
//	 *  机制：
//	 *      反序列化时，如果发现已有实例，直接将对象返回给
//	 * @return
//	 */
//	private Object readResolve(){
//		return instance;
//	}

}


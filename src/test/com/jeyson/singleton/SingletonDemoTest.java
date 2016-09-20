package test.com.jeyson.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import org.junit.Assert;
import org.junit.Test;

import main.com.jeyson.singleton.SingletonDemo01;
import main.com.jeyson.singleton.SingletonDemo02;
import main.com.jeyson.singleton.SingletonDemo03;
import main.com.jeyson.singleton.SingletonDemo04;
import main.com.jeyson.singleton.SingletonDemo05;
import main.com.jeyson.singleton.SingletonDemo06;

/**
 *
 * @Message:  created by Jeyson on 2016年9月19日
 * 
 * @Description:单例模式测试类
 */
public class SingletonDemoTest {
	/**
	 * 测试单例
	 */
	@Test
	public void testDemo01() {
		SingletonDemo01 demo011 = SingletonDemo01.getInstance();
		SingletonDemo01 demo012 = SingletonDemo01.getInstance();
		Assert.assertEquals(demo011, demo012);
		SingletonDemo05 demo051=SingletonDemo05.INSTANCE;
		SingletonDemo05 demo052=SingletonDemo05.INSTANCE;
		Assert.assertEquals(demo051, demo052);
	}
	/**
	 * 反射破解单例模式（枚举式不能破解）
	 * @throws Exception 
	 * 
	 *   反破解方法：
	 *     构造方法内判断，若已实例化，则抛出异常
	 *     if(instance!=null){
	 *        throw new Exception()}
	 */
	@Test
	public void testRefCrackSingleton() throws Exception{
		Class<SingletonDemo01> clazz= (Class<SingletonDemo01>) Class.forName("main.com.jeyson.singleton.SingletonDemo01");
		//获得无参构造器
		Constructor<SingletonDemo01> ins=clazz.getDeclaredConstructor(null);
		//跳过权限检查
		ins.setAccessible(true);
		//实例化
		SingletonDemo01 s1=ins.newInstance();
		SingletonDemo01 s2=ins.newInstance();
		System.out.println(s1);
		System.out.println(s2);
		
	}
	/**
	 * 反序列化破解单例模式
	 * @throws Exception
	 */
	@Test
	public void testSerCrackSingleton() throws Exception{
		SingletonDemo06 s1=SingletonDemo06.getInstance();
		SingletonDemo06 s2=SingletonDemo06.getInstance();
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		//s1序列化
		FileOutputStream fos=new FileOutputStream("C:\\MyWorkSpace\\test\\s1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		//反序列化
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\MyWorkSpace\\test\\s1.txt"));
		SingletonDemo06 s3=(SingletonDemo06) ois.readObject();
		System.out.println("s3:"+s3);
		ois.close();
		
	}
	/**
	 * 测试五种单例模式效率
	 * 多线程测试环境
	 */
	@Test
	public void testSingletonSpeed(){
		
		Long startTime1=System.currentTimeMillis();
		//10个线程，每个线程调用100000次
		for(int i=0;i<10;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i=0;i<100000;i++){
						Object o=SingletonDemo01.getInstance();
					}
					
				}
			}).start();
		}
		Long endTime1=System.currentTimeMillis();
		System.out.println("饿汉式计时："+(endTime1-startTime1)+"ms");
		/////////////////////////////////////////////////////////////////
		
		Long startTime2=System.currentTimeMillis();
		//10个线程，每个线程调用100000次
		for(int i=0;i<10;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i=0;i<100000;i++){
						Object o=SingletonDemo02.getInstance();
					}
					
				}
			}).start();
		}
		Long endTime2=System.currentTimeMillis();
		System.out.println("懒汉式计时："+(endTime2-startTime2)+"ms");
         /////////////////////////////////////////////////////////////////
		
		Long startTime3=System.currentTimeMillis();
		//10个线程，每个线程调用100000次
		for(int i=0;i<10;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i=0;i<100000;i++){
						Object o=SingletonDemo03.getInstance();
					}
					
				}
			}).start();
		}
		Long endTime3=System.currentTimeMillis();
		System.out.println("双重锁计时："+(endTime3-startTime3)+"ms");
         /////////////////////////////////////////////////////////////////
		
		Long startTime4=System.currentTimeMillis();
		//10个线程，每个线程调用100000次
		for(int i=0;i<10;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i=0;i<100000;i++){
						Object o=SingletonDemo04.getInstance();
					}
					
				}
			}).start();
		}
		Long endTime4=System.currentTimeMillis();
		System.out.println("静态内部类计时："+(endTime4-startTime4)+"ms");
         /////////////////////////////////////////////////////////////////
		
		Long startTime5=System.currentTimeMillis();
		//10个线程，每个线程调用100000次
		for(int i=0;i<10;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i=0;i<100000;i++){
						Object o=SingletonDemo05.INSTANCE;
					}
					
				}
			}).start();
		}
		Long endTime5=System.currentTimeMillis();
		System.out.println("枚举计时："+(endTime5-startTime5)+"ms");
         /////////////////////////////////////////////////////////////////
	}
}


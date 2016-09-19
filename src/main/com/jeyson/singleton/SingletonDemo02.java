package main.com.jeyson.singleton;
/**
 *
 * @Message:  created by Jeyson on 2016年9月19日
 * 
 * @Description:懒汉式单例模式
 * 
 *    线程安全，延迟加载，真正用的时候才去加载
 *    资源利用效率高，每次调用getInstance()方法都要同步，并发效率低
 */
public class SingletonDemo02 {
	/**
	 * 加载时就不把对象创建出来--懒汉式
	 * 类初始化时天然的是线程安全的
	 */
	private static SingletonDemo02 instance;
	private SingletonDemo02(){
		
	}
	//方法同步，并发效率低（如果不同步，并发量高的时候可能创建多个对象）
	public static synchronized SingletonDemo02 getInstance(){
		if(instance==null){
			instance=new SingletonDemo02();
		}
		return instance;
	}

}


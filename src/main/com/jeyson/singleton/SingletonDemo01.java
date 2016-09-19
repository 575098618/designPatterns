package main.com.jeyson.singleton;
/**
 *
 * @Message:  created by Jeyson on 2016年9月19日
 * 
 * @Description: 饿汉式单例模式
 * 
 *    线程安全，调用效率高
 *    不能延迟加载（不能立即使用的话，也需要加载，浪费资源）
 */
public class SingletonDemo01 {
	/**
	 * 加载时就把对象创建出来--饿汉式
	 * 类初始化时天然的是线程安全的
	 */
	private static SingletonDemo01 instance=new SingletonDemo01();
	
    private SingletonDemo01(){
	   
   }
    //方法没有同步，调用效率高
    public static SingletonDemo01 getInstance(){
    	return instance;
    }
}


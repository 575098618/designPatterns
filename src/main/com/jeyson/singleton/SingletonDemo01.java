package main.com.jeyson.singleton;
/**
 *
 * @Message:  created by Jeyson on 2016年9月19日
 * 
 * @Description: 饿汉式单例模式
 */
public class SingletonDemo01 {
	/**
	 * 加载时就把对象创建出来--饿汉式
	 */
	private static SingletonDemo01 instance=new SingletonDemo01();
	
    private SingletonDemo01(){
	   
   }
    
    public static SingletonDemo01 getInstance(){
    	return instance;
    }
}


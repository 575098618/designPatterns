package main.com.jeyson.singleton;
/**
 *
 * @Message:  created by Jeyson on 2016年9月19日
 * 
 * @Description:静态内部类单例模式
 * 
 *   线程安全，调用效率高，延迟加载
 *   
 
 */
public class SingletonDemo04 {
	
	
	private SingletonDemo04(){
		
	}
	//类加载的方式天然线程安全
	private static class Singleton04ClassInStance{
		//不存在同步问题，效率高
		private static final SingletonDemo04 instance=new SingletonDemo04();
	}
	//调用的时候才去加载，延迟加载实现
	public static SingletonDemo04 getInstance(){
		return Singleton04ClassInStance.instance;
	}

}


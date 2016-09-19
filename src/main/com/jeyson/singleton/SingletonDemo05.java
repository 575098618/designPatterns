package main.com.jeyson.singleton;
/**
 *
 * @Message:  created by Jeyson on 2016年9月19日
 * 
 * @Description: 枚举实现单例模式
 *   最简单，安全，效率高，不能延迟加载
 */
public enum SingletonDemo05 {
	/**
	 * 这个枚举元素本身就是单例
	 */
	INSTANCE;
	/**
	 * 还可以添加自己需要的操作
	 */
	public void singletonOpt(){
		
	}

}


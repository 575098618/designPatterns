package main.com.jeyson.singleton;
/**
 *
 * @Message:  created by Jeyson on 2016年9月19日
 * 
 * @Description:双重检查锁单例模式
 * 
 *   将同步内容放在if内部，提高了执行效率，不必每次获取对象都同步，只有第一次同步
 *   
 *   bug：
 *      由于编译器优化问题和JVM底层内部模型原因，偶尔会出问题
 *      不建议使用
 */
public class SingletonDemo03 {
	
	private static SingletonDemo03 instance=null;
	private SingletonDemo03(){
		
	}
	public static  SingletonDemo03 getInstance(){
		if(instance==null){
			SingletonDemo03 ins;
			synchronized (SingletonDemo03.class) {
				ins=instance;
				if(ins==null){
					synchronized (SingletonDemo03.class) {
						if(ins==null){
							ins=new SingletonDemo03();
						}
					}
					instance=ins;
				}
			}
		}
		return instance;
	}

}


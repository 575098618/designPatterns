package main.com.jeyson.factory.abstractFactory;
/**
 *
 * @Message:  created by Jeyson on 2016年9月20日
 * 
 * @Description:
 */
public interface CPU {
   void run();
   void start();
}
//高端CPU
class GoodCUP implements CPU{

	@Override
	public void run() {
		System.out.println("高端CPU运转方法。。。");
		
	}

	@Override
	public void start() {
		System.out.println("高端CPU开始方法。。。");
		
	}
	
}

//低端CPU
class  BadCPU implements CPU{

	@Override
	public void run() {
		System.out.println("低端CPU运转方法。。。");
		
	}

	@Override
	public void start() {
		System.out.println("低端CPU开始方法。。。");
		
	}
	
}




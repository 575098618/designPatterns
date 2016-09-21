package main.com.jeyson.factory.abstractFactory;
/**
 *
 * @Message:  created by Jeyson on 2016年9月21日
 * 
 * @Description:
 */
public interface Memory {
    
	void work();
}

class GoodMemory implements Memory{

	@Override
	public void work() {
		System.out.println("高性能内存工作");
		
	}
	
}
class BadMemory implements Memory{

	@Override
	public void work() {
		System.out.println("低性能内存工作");
		
	}
	
}

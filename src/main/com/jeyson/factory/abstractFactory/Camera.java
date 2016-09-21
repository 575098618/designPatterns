package main.com.jeyson.factory.abstractFactory;
/**
 *
 * @Message:  created by Jeyson on 2016年9月21日
 * 
 * @Description:
 */
public interface Camera {
   public void take();
 
}

class GoodCamera implements Camera{

	@Override
	public void take() {
		System.out.println("高端相机拍照。。。");
		
	}
	
}

class BadCamera implements Camera{

	@Override
	public void take() {
		System.out.println("低端相机拍照。。。");
		
	}
	
}
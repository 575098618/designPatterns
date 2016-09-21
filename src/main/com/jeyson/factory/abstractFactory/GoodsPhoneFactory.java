package main.com.jeyson.factory.abstractFactory;
/**
 *
 * @Message:  created by Jeyson on 2016年9月21日
 * 
 * @Description:
 */
public class GoodsPhoneFactory  implements AbPhoneFactory{

	@Override
	public CPU getCPU() {
		// TODO Auto-generated method stub
		return new GoodCUP();
	}

	@Override
	public Camera getCamera() {
		// TODO Auto-generated method stub
		return new GoodCamera();
	}

	@Override
	public Memory getMemory() {
		// TODO Auto-generated method stub
		return new GoodMemory();
	}

	

}


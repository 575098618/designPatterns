package main.com.jeyson.factory.factorymethod;
/**
 *
 * @Message:  created by Jeyson on 2016年9月20日
 * 
 * @Description: iPhone 工厂
 */
public class IPhoneFactory implements PhoneFactory{

	@Override
	public Cellphone getPhone() {
		// TODO Auto-generated method stub
		return new IPhone();
	}

}


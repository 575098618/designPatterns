package main.com.jeyson.factory.factorymethod;
/**
 *
 * @Message:  created by Jeyson on 2016年9月20日
 * 
 * @Description:samsung工厂
 */
public class SamsungPhoneFactory  implements PhoneFactory{

	@Override
	public Cellphone getPhone() {
		// TODO Auto-generated method stub
		return new Samsung();
	}

}


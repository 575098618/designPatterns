package main.com.jeyson.factory.factorymethod;
/**
 *
 * @Message:  created by Jeyson on 2016年9月20日
 * 
 * @Description:工厂方法工厂接口
 *   对于增加新产品时增加新的类即可
 *   相对于简单工厂，扩展更合乎规范
 *   缺点是要增加很多类
 *   
 * 
 */
public interface PhoneFactory {
   public Cellphone getPhone(); 
}


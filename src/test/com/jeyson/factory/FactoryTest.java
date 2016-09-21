package test.com.jeyson.factory;

import org.junit.Test;

import main.com.jeyson.factory.abstractFactory.AbPhoneFactory;
import main.com.jeyson.factory.abstractFactory.CPU;
import main.com.jeyson.factory.abstractFactory.Camera;
import main.com.jeyson.factory.abstractFactory.GoodsPhoneFactory;
import main.com.jeyson.factory.abstractFactory.Memory;
import main.com.jeyson.factory.factorymethod.Cellphone;
import main.com.jeyson.factory.factorymethod.IPhone;
import main.com.jeyson.factory.factorymethod.IPhoneFactory;
import main.com.jeyson.factory.factorymethod.Samsung;
import main.com.jeyson.factory.factorymethod.SamsungPhoneFactory;
import main.com.jeyson.factory.simpleFactory.SimplePhoneFactory;

/**
 *
 * @Message:  created by Jeyson on 2016年9月20日
 * 
 * @Description:
 */
public class FactoryTest {
  /**
   * 没有工厂的场景
   */
	@Test
	public  void testNoFactory(){
		//既要知道接口，又要知道实现的详情。客户端需要依赖接口和实现
		Cellphone phone1=new IPhone();
		Cellphone phone2=new Samsung();
		phone1.calling();
		phone2.calling();
	}
	/**
	 * 测试简单工厂
	 */
	@Test
	public void testSimpleFactory(){
		Cellphone phone=SimplePhoneFactory.getCellphone("iPhone");
		phone.calling();
	}
	
	/**
	 * 测试工厂方法
	 */
	@Test
	public void testFactoryMethod(){
		Cellphone iPhone=new IPhoneFactory().getPhone();
		Cellphone samsung=new SamsungPhoneFactory().getPhone();
		iPhone.calling();
		samsung.calling();
	}
	/**
	 * 抽象工厂
	 */
	@Test
	public void testAbstractFactory(){
		AbPhoneFactory phone=new GoodsPhoneFactory();
		CPU cpu=phone.getCPU();
		cpu.run();
		Camera camera=phone.getCamera();
		camera.take();
		Memory memory=phone.getMemory();
		memory.work();
	}
}


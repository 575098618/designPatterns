package test.com.jeyson.singleton;

import org.junit.Assert;
import org.junit.Test;

import main.com.jeyson.singleton.SingletonDemo01;
import main.com.jeyson.singleton.SingletonDemo05;

/**
 *
 * @Message:  created by Jeyson on 2016年9月19日
 * 
 * @Description:单例模式测试类
 */
public class SingletonDemoTest {
	/**
	 * 测试单例
	 */
	@Test
	public void testDemo01() {
		SingletonDemo01 demo011 = SingletonDemo01.getInstance();
		SingletonDemo01 demo012 = SingletonDemo01.getInstance();
		Assert.assertEquals(demo011, demo012);
		SingletonDemo05 demo051=SingletonDemo05.INSTANCE;
		SingletonDemo05 demo052=SingletonDemo05.INSTANCE;
		Assert.assertEquals(demo051, demo052);
	}
}


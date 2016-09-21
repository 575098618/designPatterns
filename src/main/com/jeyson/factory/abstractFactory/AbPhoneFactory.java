package main.com.jeyson.factory.abstractFactory;
/**
 *
 * @Message:  created by Jeyson on 2016年9月21日
 * 
 * @Description:
 */
public interface AbPhoneFactory {
   CPU getCPU();
   Camera getCamera();
   Memory getMemory();
}




package sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CalcMain {

	public static void main(String[] args) {
		
//		CalcBeanImpl cb = new CalcBeanImpl(5);
//		cb.setSu1(14);
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory =  new XmlBeanFactory(resource);
		
		CalcBeanImpl cb = (CalcBeanImpl) factory.getBean("cb");
		// °´Ã¼¸¸µé Å¬·¡½º 
		
		cb.calculate();
		
//		MessageBeanImpl message = new MessageBeanImpl("À±¾Æ");
//		message.setGreeting("¾È³ç");
//		message.sayHello();
		
		MessageBeanImpl message = (MessageBeanImpl) factory.getBean("message");
		message.sayHello();

	}

}

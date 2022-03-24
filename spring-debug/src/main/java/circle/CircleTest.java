package circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleTest {

	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("circle.xml");
		Business a = ac.getBean(Business.class);
		System.out.println(a.getMoney());
	}
}

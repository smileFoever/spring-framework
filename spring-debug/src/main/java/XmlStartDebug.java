import define.Apple;
import define.Banana;
import define.TestAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlStartDebug {
	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("study-config.xml");
		Apple one = ac.getBean("apple", Apple.class);
		System.out.println(one);
		Apple two = ac.getBean("getApple", Apple.class);
		System.out.println(two);
		Apple three = ac.getBean("getApple", Apple.class);
		System.out.println(three);
//		System.out.println(one.getBanana());
//		Apple two = ac.getBean("apple", Apple.class);
//		System.out.println(two);
//		System.out.println(two.getBanana());
//		Banana ba = ac.getBean("banana", Banana.class);
//		System.out.println(ba);
//		Banana ba2 = ac.getBean("banana", Banana.class);
//		System.out.println(ba2);
//		Student student = ac.getBean("student", Student.class);
//		System.out.println("==============");
//		System.out.println(student.toString());
//		System.out.println(student.getName());
//		System.out.println("测试");
//		TestAnnotation l = new TestAnnotation();
	}
}

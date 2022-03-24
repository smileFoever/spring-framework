package circle;

import lombok.Data;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;


@Data
@Component
public class A {

	@Autowired
	public B b;

	public A(){
		System.out.println("构造器");
	}

//	@PostConstruct
	public void initMethod(){
		System.out.println("指定初始化方法");
	}
	@Override
	public String toString(){
		return "a";
	}

}

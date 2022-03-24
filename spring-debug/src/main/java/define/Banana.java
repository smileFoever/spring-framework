package define;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Banana {
	public Banana(){
		System.out.println("则是一个香蕉");
	}
}

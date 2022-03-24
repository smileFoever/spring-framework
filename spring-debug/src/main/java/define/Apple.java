package define;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Apple {

	@Autowired
	public Banana banana;
	public String init = "kskdkd";

	public Apple(){
		System.out.println("一个苹果");
	}


}

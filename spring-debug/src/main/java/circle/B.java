package circle;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class B {

	@Autowired
	public A a;

	@Override
	public String toString(){
		return "b";
	}
}

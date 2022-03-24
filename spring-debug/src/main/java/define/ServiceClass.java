package define;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Configuration
public class ServiceClass {

	@Bean
	public Apple getApple(){
		return new Apple();
	}
}

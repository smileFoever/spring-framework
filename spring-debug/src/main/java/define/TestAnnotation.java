package define;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

//@Import({StudentTwo.class})
//@Configuration
//@ImportResource
public class TestAnnotation {

	private String name;

	public TestAnnotation() {
	}
	@Bean
	public StudentTwo get(){
		return new StudentTwo();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TestAnnotation(String name) {
		this.name = name;
	}
}

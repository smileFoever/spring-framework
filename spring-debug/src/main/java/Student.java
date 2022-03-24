import define.StudentTwo;
import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Data
@ToString
//@Import(StudentTwo.class)
//@Configuration
//@Order(1)
public class Student extends StudentTwo{

	private String name;
	private Integer age;

}

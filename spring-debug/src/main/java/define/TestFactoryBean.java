package define;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestFactoryBean implements FactoryBean<StudentTwo> {
	@Override
	public StudentTwo getObject() throws Exception {
		return new StudentTwo();
	}

	@Override
	public Class<?> getObjectType() {
		return StudentTwo.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}

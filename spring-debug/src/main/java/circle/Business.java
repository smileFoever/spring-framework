package circle;

import lombok.Data;

@Data
public class Business {

	public Integer money;

	public Integer getMoney(){
		System.out.println("返回钱");
		return this.money;
	}

}

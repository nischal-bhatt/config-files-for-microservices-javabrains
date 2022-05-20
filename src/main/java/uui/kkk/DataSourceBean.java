package uui.kkk;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
public class DataSourceBean {

	public DataSourceBean()
	{
		System.out.println("datasourcebean created because env is test");
	}
}

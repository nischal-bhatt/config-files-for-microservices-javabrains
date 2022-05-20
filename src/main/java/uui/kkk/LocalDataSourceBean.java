package uui.kkk;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("default")
public class LocalDataSourceBean {

	public LocalDataSourceBean()
	{
		System.out.println("local bean created coz profile is default!");
	}
}

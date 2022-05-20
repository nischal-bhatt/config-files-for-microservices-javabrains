package uui.kkk;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	
	@Autowired
	private DbSettings dbSettings;
	
	@Value("${app.description}")
	private String greetingMessage;
	
	@Value("some static message")
	private String staticMessage;
	
	@Value("${appie.descy: default ratlam}")
	private String staticMessage2;
	
	@Value("${my.list.values}")
	private List<String> staticMessage3;
	
	@Value("#{${dbValues}}")
	private Map<String,String> staticMessage4;
	
	@Value("${my.greeting}")
	private String staticMessage5;
	
	@GetMapping("/greeting")
	public String greeting()
	{
		return this.greetingMessage + staticMessage + staticMessage2+staticMessage3+staticMessage4+dbSettings.getPort();
	}
	
	@GetMapping("/greetingGet")
	public String getgreeting()
	{
		return this.staticMessage5;
	}
	
}

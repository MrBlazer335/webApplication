package heroku.leomir.main.webApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@ResponseBody
public class WebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
		System.err.println("we got an error here!");
	}

}

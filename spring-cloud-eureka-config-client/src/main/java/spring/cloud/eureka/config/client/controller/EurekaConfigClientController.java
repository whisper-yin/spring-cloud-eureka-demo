package spring.cloud.eureka.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaConfigClientController {
	
	@Value("${data.password}")
	public String password;
	
	@GetMapping("/getFileContent")
	public String getFileContent() {
		return password;
	}
}

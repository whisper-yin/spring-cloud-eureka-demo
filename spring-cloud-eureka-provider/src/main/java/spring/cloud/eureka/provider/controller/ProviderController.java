package spring.cloud.eureka.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import spring.cloud.eureka.provider.bean.User;
import spring.cloud.eureka.provider.repository.UserJpaRepository;

@RestController
public class ProviderController {
	
	@Autowired
	private UserJpaRepository userJpaRepository;

	@GetMapping("/status")
	public String getStatus() {
		return "registed success !";
	}
	
	@GetMapping("/findUser/{id}")
	public User findUser(@PathVariable Integer id) {
		return userJpaRepository.findOne(id);
	}
}

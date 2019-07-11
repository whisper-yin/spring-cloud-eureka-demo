package spring.cloud.eureka.config.client.application;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
@EnableDiscoveryClient
@ComponentScan(basePackages= {"spring.cloud.*"})
public class EurekaConfigClient {
	public static void main(String[] args) {
		SpringApplication.run(EurekaConfigClient.class, args);
	}
}

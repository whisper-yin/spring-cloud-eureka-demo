package spring.cloud.eureka.provider.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages= {"spring.cloud.*"})
@EnableDiscoveryClient
@EntityScan(basePackages = {"spring.cloud.*"})
@ComponentScan(basePackages= {"spring.cloud.*"})
public class EurekaProviderApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaProviderApplication.class)
        .properties("spring.config.name:application,database").build().run(args);
	}
}
package br.com.stoom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EntityScan(basePackages="br.com.stoom.entity")
@ComponentScan(basePackages={"br.com.*"})
@EnableJpaRepositories(basePackages={"br.com.stoom.repository"})
@EnableTransactionManagement
public class StoomApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoomApplication.class, args);
	}

}

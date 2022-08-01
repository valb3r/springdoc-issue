package com.valb3r.warehousee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories
@EnableTransactionManagement
@EnableConfigurationProperties
@SpringBootApplication
public class SpringDocIssue {

	public static void main(String[] args) {
		SpringApplication.run(SpringDocIssue.class, args);
	}
}

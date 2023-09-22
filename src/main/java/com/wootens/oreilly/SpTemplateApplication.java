package com.wootens.oreilly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//(exclude = { DataSourceAutoConfiguration.class })
public class SpTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpTemplateApplication.class, args);
	}

}

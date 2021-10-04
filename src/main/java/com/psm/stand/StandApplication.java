package com.psm.stand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class StandApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandApplication.class, args);
	}

}

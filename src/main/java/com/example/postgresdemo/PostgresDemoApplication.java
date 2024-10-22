package com.example.postgresdemo;

import org.apache.tomcat.jni.Time;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PostgresDemoApplication {
	public static void main(String[] args) {
		System.out.println("START:" + Time.now());
		SpringApplication.run(PostgresDemoApplication.class, args);
		System.out.println("End:" + Time.now());
	}
}

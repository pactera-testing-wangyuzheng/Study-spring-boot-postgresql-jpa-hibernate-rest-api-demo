package com.example.postgresdemo;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PostgresDemoApplication {
	public static void main(String[] args) {
		Date date1 = new Date();
		SimpleDateFormat formatter =new SimpleDateFormat("yy-mm-dd HH:mm:ss");
		System.out.println("Start:" + formatter.format(date1));
		SpringApplication.run(PostgresDemoApplication.class, args);
		Date date2 = new Date();
		System.out.println("End:" + formatter.format(date2));
		System.out.println("test");
	}
}

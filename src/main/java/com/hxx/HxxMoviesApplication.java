package com.hxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hxx.mapper")
public class HxxMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HxxMoviesApplication.class, args);
	}

}

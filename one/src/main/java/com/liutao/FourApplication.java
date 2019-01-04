package com.liutao;

import com.liutao.conf.EnvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({EnvConfig.class})
public class FourApplication {

	public static void main(String[] args) {
		SpringApplication.run(FourApplication.class, args);
	}

}


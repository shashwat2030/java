package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@SpringBootApplication
public class DemoApplication {
	@RequestMapping("/")
			String Imfunc()
	{
		return "Welcome-to-Spring-boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ac)
			{
				return agrs->{
					System.out.println("Beans getting loaded initially");
				String[] beans =ac.getBeanDefinitionNames();
					Arrays.sort(beans);
					for (String bean: beans)
					{
						System.out.println(bean);
					}
				};

	};

}

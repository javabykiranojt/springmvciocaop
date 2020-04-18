package com.jbk.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.jbk.config")
@EnableScheduling
@EnableAsync
@EnableAspectJAutoProxy
public class WebConfiguration implements WebMvcConfigurer {
	@Bean
	public InternalResourceViewResolver myresolver() {
		System.out.println("2222myresolver..........");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/admin/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	// every midnight take emails from database
	// for those having birthdate today
	@Scheduled(cron = "*/10 * * * * *")
	public void sendBirthdayWishes() {
		System.out.println("db code");
		// rows check if any row increased then take out
		//that email id and send email
		// users table uid uname passwd / birthdate//email
		// 10 user
		// 11 user
		// welcome email
		System.out.println("email  code");
	}

}

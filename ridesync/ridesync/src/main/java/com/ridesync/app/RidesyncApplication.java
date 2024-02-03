package com.ridesync.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ridesync.app.loginPageController.loginPage;

@SpringBootApplication
@ComponentScan(basePackageClasses=loginPage.class) // spring adds all controllers from the sub package. to include others we must specify this.
public class RidesyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(RidesyncApplication.class, args);
	}

}

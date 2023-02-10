package com.adri.AdriInternship_Mattikan.Tongsai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.adri.AdriInternship_Mattikan.Tongsai") 
@ComponentScan({"com.adri.AdriInternship_Mattikan.*"})
@SpringBootApplication
public class AdriInternshipMattikanTongsaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdriInternshipMattikanTongsaiApplication.class, args);
	}

}

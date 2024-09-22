package com.sirius.tech.learn.config;

import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing
@EnableJpaRepositories("com.sirius.tech.learn.dao")
@EntityScan("com.sirius.tech.learn.entity")
@ComponentScan("com.sirius.tech.learn.service")
public class LearnConfig {
	
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
}

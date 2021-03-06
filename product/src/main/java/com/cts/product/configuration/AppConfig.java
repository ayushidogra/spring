package com.cts.product.configuration;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value= {@ComponentScan("com.cts.product.dao"),@ComponentScan("com.cts.product.service")})

public class AppConfig {
	
	@Autowired
	private Environment environment ;
	
	

}

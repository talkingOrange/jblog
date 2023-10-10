package com.poscodx.jblog.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {

	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl("jdbc:mariadb://192.168.0.178:3307/jblog?charset=utf8");
		dataSource.setUsername("jblog");
		dataSource.setPassword("jblog");
		dataSource.setInitialSize(10);
		dataSource.setMaxActive(20);
		
		return dataSource;
	}
}

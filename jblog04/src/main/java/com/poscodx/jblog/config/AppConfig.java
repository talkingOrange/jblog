package com.poscodx.jblog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.poscodx.jblog.repository", "com.poscodx.jblog.service"})
@Import({DBConfig.class})
public class AppConfig {

}

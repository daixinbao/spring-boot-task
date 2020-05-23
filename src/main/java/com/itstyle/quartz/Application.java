package com.itstyle.quartz;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动类
 * API接口测试：http://localhost:8080/task/swagger-ui.html
 */
@MapperScan("com.itstyle.quartz.dao")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
public class Application {
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("项目启动 ");
	}
}
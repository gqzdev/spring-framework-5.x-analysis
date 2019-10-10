package com.gqz.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName JavaConfig
 * @Description
 * @Author ganquanzhong
 * @Date2019/9/7 23:18
 * @Version
 **/

@Configuration
@ComponentScan
public class JavaConfig {

	@Bean
	public User user(){
		return new User(101,"ganquanzhong","123456");
	}
}

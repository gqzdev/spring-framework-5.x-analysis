package com.gqz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description
 * @Author ganquanzhong
 * @Date2019/9/7 23:19
 * @Version
 **/
public class Test {

	public static void main(String[] args){
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User)ac.getBean(User.class);
		System.out.println(user.toString());
	}
}

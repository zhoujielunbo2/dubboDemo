package com.hqyg.provider.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartDubboService {

	public static void main(String[] args) throws IOException {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/dubbo-provider.xml");
		 context.start();
		 System.in.read(); // 按任意键退出

	}

}

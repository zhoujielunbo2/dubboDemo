package com.hqyg.provider.Impl;

import com.hqyg.common.HelloService;
/**
 * 
 * @author hexiaobo
 *
 */
public class HelloServiceImpl implements HelloService {

	public void sayHello() {
		System.out.println("I am service provider");
		
	}

	public void sayHello2() {
		System.out.println("sayHello2");
		
	}

}

package dubboConsumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hqyg.common.HelloService;

public class ddd {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/dubbo-consumer.xml");
		 HelloService ss= (HelloService) context.getBean("helloService");
		 ss.sayHello();

	}

}

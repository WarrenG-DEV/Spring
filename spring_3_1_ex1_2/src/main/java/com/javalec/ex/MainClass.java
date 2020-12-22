package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
// 스프링 적용 O
	public static void main(String[] args) {
/*		
		myCalculator myCalculator = new myCalculator();
		myCalculator.setCalculator(new Calculator());
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
*/
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
				
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
				;
	}

}

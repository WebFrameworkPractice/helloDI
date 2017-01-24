package kr.ac.hansung.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"kr/ac/hansung/spring/di/bean/animal.xml");

		PetOwner person = (PetOwner) context.getBean("petOwner");
		
		person.play();
		
		context.close();
		
	}

}

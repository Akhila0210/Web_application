package IOC_container;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import CarProject.Car;

public class SpringBean {
	public static void main(String[] args) throws BeansException{
		ApplicationContext ct=new ClassPathXmlApplicationContext("bean.xml");
		
		  Car c = ct.getBean(Car.class);
		  c.show();
		
	}

}

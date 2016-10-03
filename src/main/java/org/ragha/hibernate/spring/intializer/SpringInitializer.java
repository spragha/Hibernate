package org.ragha.hibernate.spring.intializer;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class SpringInitializer {

	private static ApplicationContext context = null;
	
	static{
		try{
		setContext(new ClassPathXmlApplicationContext("spring-hibernate.xml"));
		}
		catch(Exception e){
			System.out.println("Exception in class : "+e);
		}
	}

	public static ApplicationContext getContext() {
		System.out.println("context returned");
		return context;
	}

	public static void setContext(ApplicationContext context) {
		SpringInitializer.context = context;
		System.out.println("Bean definitins list"+Arrays.toString(context.getBeanDefinitionNames()));
	}
	
	public static HibernateTemplate getHibernateTemplate(){
		
		HibernateTemplate template = (HibernateTemplate) context.getBean("hibernateTemplate");
		template.setCheckWriteOperations(false);
		
		return template;
		
	}
	
	/*public static CustomerService getCustomerServiceImpl(){
		
		CustomerService service = (CustomerServiceImpl) context.getBean("customerService");
		//template.setCheckWriteOperations(false);
		
		return service;
		
	}*/
}

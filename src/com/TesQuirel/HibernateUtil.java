package com.TesQuirel;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	
	static {
		
		Configuration config = new Configuration();
		config.configure();
		
		factory = config.buildSessionFactory();	
		System.out.println(" session factory created ");
		
	}

	public static SessionFactory getSessionFactory() {		
		return factory;
	}

	private HibernateUtil()
	{
	}
	
	
	
	
	
	
	

}

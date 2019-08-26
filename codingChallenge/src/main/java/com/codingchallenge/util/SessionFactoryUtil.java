package com.codingchallenge.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryUtil {

	private static SessionFactory sf;

	static {
		Configuration configuration = new Configuration().configure();

		configuration.setProperty("hibernate.connection.username", System.getenv("FEST_USERNAME"));
		configuration.setProperty("hibernate.connection.password", System.getenv("FEST_PASSWORD"));
		configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://" + System.getenv("FEST_DATABASE"));

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

		sf = configuration.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionFactory() {

		return sf;
	}
}
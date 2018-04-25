package com.topgear.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.topgear.assignment.hibernate.Student;

public  class Connection {
	static SessionFactory factory;
	static{
		System.out.println("Connection established ");
		 factory=new Configuration()
		.configure("/com/topgear/assignment/hibernate.cfg.xml")
		.addAnnotatedClass(Student.class)
		.buildSessionFactory();
	}
	public static SessionFactory  getConnection(){
		
		return factory;
	}
}

package com.TesQuirel;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeTest
{
	// for Creating and adding the records
	public static void Add() 
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();		
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		Employee e1= new Employee();
		System.out.println("Enter the Employee id");
		e1.setEmployeeId(sc.nextInt()	);
		System.out.println("Enter the Employee Name");
		e1.setEmployeeName(sc.next());
		System.out.println("Enter the Employee Address");
		e1.setEmployeeAdd(sc.next());
		session.save(e1);
		tx.commit();		
	}
	// for upating
	public static void update()
	{
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  Scanner sc=new Scanner(System.in);
		  session.beginTransaction();		  
		  System.out.println("Enter the Id number for update ");
		  Employee employee = (Employee)session.get(Employee.class, sc.nextInt());
		  System.out.println("Enter new employee name");
		  employee.setEmployeeName(sc.next());
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
		
	}
	public static void read()
	{
		  SessionFactory sf = HibernateUtil.getSessionFactory();
		  Session session = sf.openSession();
		  session.beginTransaction();
		  Employee employee=new Employee();
		  Query query = session.createQuery("from Employee");
		  List<Employee> l = query.getResultList();
		  for(Employee emp :l)
		  {
			  		System.out.println("EmployeeId: "+employee.getEmployeeId()+", Employee Name: "+employee.getEmployeeName()+", Address: "+employee.getEmployeeAdd());
		  }
		  session.getTransaction().commit();
		  sf.close();
	}
	public static void delete()
	{
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the id for deleting");
		  Employee employee = (Employee)session.load(Employee.class, sc.nextInt());
		  session.delete(employee);
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
		
	}
	
	public static void main(String[] args) 
	{
		// Add();
		//update();
		//read();
		//delete();
		
	}
	
	

	

}

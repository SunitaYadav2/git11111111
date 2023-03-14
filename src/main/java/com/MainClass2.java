package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();
        
      //retrieve  the record   ----> 1. load()              2. get()
      		//fetch Employee with empId(primary key)--> using load()
      		
      		/*
      		Employee e1=session.load(Employee.class,4);
      		System.out.println(e1);  //record as a from of an object
      		
      		
      		//fetch the record using get()
      		Employee e2=session.get(Employee.class,3);
      		
      		System.out.println(e2);
      		
      		
      		
      		
      		//if we use load(), then be assure about primary key value
      		//if record is not available, then load() throw the exception
      		Employee e3=session.load(Employee.class,86);
      		System.out.println(e3);
      		*/
      		
      		//if we use get() and if record is not available, then it returns NULL value as an output 
      			Employee e4=session.get(Employee.class,2);
      				System.out.println(e4);
      		
      		          
        


		
		
        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------

		
		
		
		

	}

}

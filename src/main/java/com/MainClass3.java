package com;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();
        
        //fetching all the record from Employee table
        
        
        String hql="from Employee";
          Query query=session.createQuery(hql);
        
        
        List<Employee> listofEmployee=query.list();
    for(Employee tempa:listofEmployee) {
    	
    	// System.out.println(tempa);
    	 System.out.println(tempa.getName());
    }

        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------

		
		
		
		

	}

}

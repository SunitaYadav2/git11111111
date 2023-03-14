package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FeatchOneRecordMain {

	public static void main(String[] args) {


		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();



     /*  String hql="from Employee where empId=:x";
          Query query=session.createQuery(hql);
        query.setInteger("x", 4);
        
        List<Employee>  listofEmployee=query.list();
        for(Employee tempa:listofEmployee) {
        	System.out.println(tempa);
        	
        }
       */ 
        

         String hql="from Employee where empid=:x";
             Query query=session.createQuery(hql);
           query.setString("x", "4");
           
           List<Employee> listofEmployee=query.list();
           for(Employee tempa:listofEmployee) {
           	System.out.println(tempa);
        
           }
        
        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------  

	}

}

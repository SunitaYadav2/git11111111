package com;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteOperationMain {

	public static void main(String[] args) {


		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();

//update Query--

      String hql="delete from Employee where empId=:a";
          Query query=session.createQuery(hql);


        query.setParameter("a", 3);
         
          int recordDeleted=query.executeUpdate();
        	 
          if(recordDeleted>0) {
        	  System.out.println(recordDeleted +    "one record deleted successfully");
          }




        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------  

	}

}

package com;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateOperationMain {

	public static void main(String[] args) {


		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();

//update Query--

      String hql="update Employee set name=:x where empId=:a";
          Query query=session.createQuery(hql);
        query.setParameter("x", "Sunita kumari");
        query.setParameter("a", 4);
         
          int recordUpdated=query.executeUpdate();
        	 
          if(recordUpdated>0) {
        	  System.out.println(recordUpdated +"one record updated successfully");
          }




        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------  

	}

}

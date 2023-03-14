package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();
		
		//Employee emp1= new Employee("Ram",10000);
		
		  //  session.save(emp1);
		
	//Employee emp1= new Employee("Ram",10000);
		
		 //   session.persist(emp1);
        
      //  Employee emp3= new Employee("sunita",70000); 
        //by using save method we can save record in db
        //it returns primary key value as an int form
        
    //     int key= (int)    session.save(emp3);
 //  System.out.println(key);
   

        
        Employee emp3= new Employee("Shyam",50000);
            session.persist(emp3);//persist method doesnot return anything
        
            Employee emp4= new Employee("ram",50000);
            session.persist(emp4);
		
        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------

		
		
		
		

	}

}

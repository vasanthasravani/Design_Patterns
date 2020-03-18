package PrototypeDesignPattern;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class PrototypeDemo{  
     public static void main(String[] args) throws IOException {  
    	 final Logger logger=LogManager.getLogger(PrototypeDemo.class);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        logger.info("Enter Employee Id: ");  
        int eid=Integer.parseInt(br.readLine());  
       // System.out.print("\n");  
        logger.debug("Emp Id: "+eid);
          
       logger.info("Enter Employee Name: ");  
        String ename=br.readLine();  
       // System.out.print("\n"); 
        logger.debug("Emp Namw: "+ename);
          
       logger.info("Enter Employee Designation: ");  
        String edesignation=br.readLine();  
       // System.out.print("\n");  
        logger.debug("Emp des: "+edesignation);
          
       logger.info("Enter Employee Address: ");  
        String eaddress=br.readLine();  
       // System.out.print("\n"); 
        logger.debug("Emp add: "+eaddress);
          
        logger.info("Enter Employee Salary: ");  
        double esalary= Double.parseDouble(br.readLine());  
       // System.out.print("\n");  
        logger.debug("Emp sal: "+esalary);
           
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  
          
        e1.showRecord();  
       // System.out.println("\n");  
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
        e2.showRecord(); 
       
    }     
}
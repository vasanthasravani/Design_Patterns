package AbstractFactoryPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract class Loan{  
	final Logger logger=LogManager.getLogger(Loan.class);
    
	   protected double rate;  
	   abstract void getInterestRate(double rate);  
	   public void calculateLoanPayment(double loanamount, int years)  
	   {  
	        double EMI;  
	         int n;  
	  
	         n=years*12;  
	         rate=rate/1200;  
	         EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
	  
	logger.info("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");     
	 }  
	}
package AdapterPattern;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class AdapterPatternDemo {  
	 public static void main(String args[]){  
		 final Logger logger=LogManager.getLogger(AdapterPatternDemo.class);
	  CreditCard targetInterface=new BankCustomer();  
	  targetInterface.giveBankDetails();  
	  logger.debug(targetInterface.getCreditCard());  
	 
	 }   
	}
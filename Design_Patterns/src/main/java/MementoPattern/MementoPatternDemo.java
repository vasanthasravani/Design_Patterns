package MementoPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class MementoPatternDemo {  
    
    public static void main(String[] args) {  
    	final Logger logger=LogManager.getLogger(MementoPatternDemo.class);
          
          Originator originator = new Originator();  
            
          Caretaker careTaker = new Caretaker();  
            
          originator.setState("State #1");  
          careTaker.add(originator.saveStateToMemento());  
          originator.setState("State #2");  
          careTaker.add(originator.saveStateToMemento());  
          originator.setState("State #3");  
          careTaker.add(originator.saveStateToMemento());  
          originator.setState("State #4");  
  
          logger.debug("Current State: " + originator.getState());          
          originator.getStateFromMemento(careTaker.get(0));  
          logger.debug("First saved State: " + originator.getState());  
          originator.getStateFromMemento(careTaker.get(1));  
          logger.debug("Second saved State: " + originator.getState());  
          originator.getStateFromMemento(careTaker.get(2));  
          logger.debug("Third saved State: " + originator.getState()); 
          
       }  
  
}  
package BridgePattern;
import java.util.ArrayList;  
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

 
public class JavaQuestions implements Question {  
	final Logger logger=LogManager.getLogger(JavaQuestions.class);
    
 private List <String> questions = new ArrayList<String>();  
 private int current = 0;  
 public JavaQuestions(){  
    questions.add("What is class? ");  
    questions.add("What is interface? ");  
    questions.add("What is abstraction? ");  
    questions.add("How multiple polymorphism is achieved in java? ");  
    questions.add("How many types of exception  handling are there in java? ");  
    questions.add("Define the keyword final for  variable, method, and class in java? ");  
    questions.add("What is abstract class? ");  
    questions.add("What is multi-threading? ");  
 }  
 public void nextQuestion() {  
    if( current <= questions.size()-1 )  
    current++;  
    logger.debug(current);  
 }  
  
 public void previousQuestion() {  
    if( current > 0 )  
    current--;  
 }  
  
 public void newQuestion(String quest) {  
    questions.add(quest);  
 }  
  
 public void deleteQuestion(String quest) {  
    questions.remove(quest);  
 }  
  
 public void displayQuestion() {  
    logger.debug( questions.get(current) );  
 }  
 public void displayAllQuestions() {  
    for (String quest : questions) {  
    logger.debug(quest);  
 }  
}  
}
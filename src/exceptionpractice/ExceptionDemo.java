package exceptionpractice;

/**
 * = milk can not out of stock program =
 * 
 * - If society are never run out of milk.
 * - so to take care of this situation (the number of milk entered is 0) 
 *  -> we can use an exception.
 * 
 * - use if-else statement below
 * 
 *   - the if statement says that if we have no milk, the program should do something exceptional.
 *   - the something exceptional is given after the word "catch".
 *   
 *   - the normal situation is handled by the code following the word "try".
 *   - the code following the word "catch" is used only in exceptional circumstances.
 *   - the basic way of handling exception in Java consists of a "try-throw-catch" threesome.
 * 
 * = try-throw-catch =
 * 
 *  -> for handling exception
 *    
 * - 1. try :
 *   - A try block detects an exception.
 * - 2. throw :
 *   - A throw statement throws an exception.
 * - 3. catch :
 *   - A¡@catch block deals with a particular exception.
 *   
 *   
 * = A new object of Exception class =
 * 
 * - Ex:    
 * - throw new Exception("Exception : No milk!");
 * 
 *   - If this statement executes, it creates a new object of the predefined class Exception with the expression
 *     -> new Exception("Exception : No milk!");
 *        and throws the exception object.
 *        
 *     - The String "Exception: No milk!" is an argument for the constructor of the class Exception.
 *       - The Exception object created here stores this string in an instance variable of the object
 *         so that it can be recovered later.
 * 
 * = the catch block looks like a method =
 * 
 * - the catch block looks like a method definition that has a parameter.
 * - although it is not a method definition, a catch block behaves like a method.
 *   - it is a separate piece of code that is executed when a program executes a "throw statement"
 *   - this throw statement is similar to method call, but instead of calling a method, it calls the catch block
 *     and causes the code in the catch block to be executed.
 *     
 *     ex:
 *     
 *     catch(Exception e)
 *     
 *     - The identifier e looks like a parameter and acts very much like a parameter.
 *     - So even though the catch block is not method, we call this "e" the catch block parameter
 *     - the catch block parameter give us a name for the exception that is caught,
 *       so we can write code within the catch block to manipulate the exception object.
 *       
 *     - the most common name for a catch block parameter is e, but you can use any legal identifier.
 *     
 *     - When an exception object is thrown, it is plugged in for the catch-block parameter e, and the code on the catch is executed.
 *       - so, in this case, you can think of e as the name of the exception object that was thrown.
 *     
 *     - getMessage :  
 *      
 *     - Every exception object has a method called "getMessage", and unless you provide code specifying,
 *       otherwise, this method retrieves the string that was given to the exception object by its constructor when the exception was thrown.
 *       
 *       ex: 
 *       e.getMessage() -> returns "Exception : No milk!"
 *           
 *     - only one catch block executes per try block.
 *     - If an exception occurs within a try block, the rest of the block is ignored.   
 *  
 */

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		try {
			System.out.println("Enter number of donuts : ");
			int donutCount = keyboard.nextInt();
			
			System.out.println("Enter number of glasses of milk : ");
			int milkCount = keyboard.nextInt();
			
			if (milkCount < 1)
				throw new Exception("Exception : No milk!"); // create a object that has a message
			
			double donutPerGlass = donutCount / (double)milkCount; // put the double at dividend -> the answer will contains double.
			
			System.out.println("You have " + donutCount + "donuts.");
			System.out.println("You have " + milkCount + " glasses of milk.");
			System.out.println("You have " + donutPerGlass + " donuts for each glass of milk.");
			
		}catch(Exception e) {
			System.out.println(e); //e can give detail error message.
			System.out.println(e.getMessage()); // return the detail message of this throwable, which can be null. null -> throw new Exception()
			
			System.out.println("Go buy some milk.");
		}
		
		System.out.println("End of program.");

	}

}

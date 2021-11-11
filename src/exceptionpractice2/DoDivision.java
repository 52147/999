package exceptionpractice2;
/**
 * 
 * = Overriding  method = 
 * 
 * 
 * = throws clause in method =
 * 
 * Sometimes it makes sense to delay handling of an exception.
 *  - for example, you might have a method whose code throws an exception,
 *    but you may not want to catch the exception in that method.
 *   - it makes sense not to catch the exception in the method definition,
 *     -> to have code that uses the method place the method invocation in a try block 
 *        and catch the exception in a catch block.
 *  
 *  - If a method does not catch an exception, it must at least warn programmers that any invocation of the method might possibly throw an exception.
 *    This warning is called a throws clause.
 *    
 *    - For example :
 *      a method that might throw a DivideByZeroException but that does not catch the exception would have a heading like the following one:
 *      
 *       public void sampleMethod() throws DivideByZeroException
 *       
 *       - it states that an invocation of the method sampleMethod might throw a DivideByZeroException.       
 *       - throws DivideByZero -> throw clause
 *       
 * - passing the buck
 *      
 *   public void methodA throws DivideByZeroException
 *   
 *   - In this case, methodA is absolves of the responsibility of catching any exception of type DivideByZeroException
 *     that might occur when methodA is executed.
 *   - If the methodB includes an invocation of methodA, methodB must deal with the exception.
 *   - methodA has passed the responsibility ("passed the buck") for any exceptions of type DivideByException from itself to any method that calls it.
 *   
 * - throws clause can contain more than one exception type.
 * 
 *   For example :
 *   public int myMethod() throws IOException, DivideByZeroException    
 *   
 * - If a derived class overrides a base-class method that has a throws clause,
 *   you can not add exception to the throws clause of the new overriding method.       
 * 
 *       
 *  - A method might not catch an exception that its code throws
 *  - A method that does not handle an exception that it throws must gave a "throws clause" in its heading.
 *  - A method that can throw several different exceptions has only one throws clause.
 *  - throwing an exception can end the method.
 *   - if a method throws an exception, and the exception is not caught inside the method,
 *     the method invocation ends immediately after the exception is thrown.
 *     
 *     
 * = throw vs. throws =
 * 
 *  - throw : the keyword throws is used to throw an exception, 
 *  - throws : throws is used in a method's heading to declare an exception.
 *  - Thus, a throw statement throws an exception, but a throw clause declares one.
 * 
 *  
 *  
 * = Arithmetic exception =
 *  
 *   - ArithmeticException is the exception which is normally thrown when you divide by 0.
 *   
 * = IllegalArgumentException =
 * 
 * Thrown to indicate that a method has been passed an illegal or inappropriate argument.
 * 
 * 
 * 
 * 
 *     
 */

/**
 * = DoDivision program =
 *  - use this program to practice throw clause in method definition.
 *  - The normal case is in a method called doNormalCase.
 *  - This method can throw a exception DivideByZeroException, but it does not catch it.
 *  - Thus, we need to declare this possible exception in a throw clause in the heading of the method's definition.
 */
import java.util.Scanner;

public class DoDivision {

	private int numerator;
	private int denominator;
	private double quotient;

	public static void main(String[] args) {

		DoDivision doIt = new DoDivision();

		try {
			doIt.doNormalCase();
		} catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
			doIt.giveSecondChance();
		}
		System.out.println("End of program.");

	}

	public void doNormalCase() throws DivideByZeroException { // DividedByZeroException can be changed by the ArithmeticException (this exception do not need to create a class)
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter numerator :");

		numerator = keyboard.nextInt();

		System.out.println("Enter denominator :");
		denominator = keyboard.nextInt();
		if (denominator == 0)
			throw new DivideByZeroException();
		quotient = numerator / (double) denominator;
		System.out.println(numerator + "/" + denominator + "=" + quotient);
	}

	 public void giveSecondChance() {
		System.out.println("Try again :");
		System.out.println("Enter numerator :");
		Scanner keyboard = new Scanner(System.in);
		numerator = keyboard.nextInt();
		System.out.println("Enter denominator :");
		System.out.println("Be sure the denominator is not zero");
		denominator = keyboard.nextInt();

		// Sometimes, dealing with an exceptional case without throwing an exception is
		// better.
		if (denominator == 0) {
			System.out.println("I cannot do division by zero.");
			System.out.println("Since I cannot do what you want, the program will now end.");
			System.exit(0);
		}
		quotient = ((double) numerator) / denominator;
		System.out.println(numerator + "/" + denominator + "=" + quotient);

	}

}

package exceptionpractice2;

/**
 * = Defining your own Exception class =
 * 
 *  - you can define your own exception classes, but they must be derived classes of some already defined exception class.
 *  - our example will be derived classes of the class Exception.
 *  - when you defining an exception class, the constructors are the most important and often the only methods, 
 *    other than those inherited class from the base class.
 *    
 *    For example:
 *    DivideByZeroException class 
 *     - whose only method are a default constructor and a constructor having one String parameter.
 *     - this class inherit all the method of the base class Exception.
 *       - the class DivideByZeroException inherits the method getMessage, which returns a string message.
 *        - in the definition  of the default constructor, this string message is set by the following statement:
 *          super("Dividing by Zero!");
 *          -> this statement calls a constructor of the base class Exception.
 */

public class DivideByZeroException extends Exception {
	
	public DivideByZeroException(String message) {
		super(message); // super is an invocation of the constructor for the base class Exception.
	}

	public DivideByZeroException() {
		super("Dividing by Zero!");
	}

}

/**
 * 
 */
package assignment3_1;

/**
 * @author MANJUNATH, This class is to differentiate between instance variables
 *         and class variables. And also show the scope of each.
 *
 */
public class Assignment3_1 {

	/**
	 * @param
	 */
	int instanceVariable = 10; // Instance Variable - Whose scope limits to the object

	static int classVariable = 20; // Class Variable - Whose scope limits to the Class of objects

	public static void main(String[] args) {

		Assignment3_1 classInstanceVariablesOne = new Assignment3_1(); // Object One
		Assignment3_1 classInstanceVariablesTwo = new Assignment3_1(); // Object Two

		System.out.println("Instance variable value Before changing from Object ONE -"
				+ classInstanceVariablesOne.instanceVariable);
		System.out.println("Class variable value Before changing from Object ONE -" + Assignment3_1.classVariable);
		System.out.println();

		classInstanceVariablesOne.instanceVariable = 20; // Value set to Instance variable from the object one.
		Assignment3_1.classVariable = 30; // Value set to Class variable in a static manner.

		System.out.println("Instance variable value After changing from Object ONE -"
				+ classInstanceVariablesOne.instanceVariable); // Prints the instance variable value From the object one
																// - which will print 20
		System.out.println("Class variable value After changing from Object ONE -" + Assignment3_1.classVariable);
		// Prints the Class variable value accessed in a static way - which will print
		// 30
		System.out.println();

		// Prints the instance variable value From the object two - which will print 10
		// (As the scope is limited to object)
		System.out.println("Instance variable value After changing from Object Two -"
				+ classInstanceVariablesTwo.instanceVariable);
		// Prints the Class variable value accessed in a static way - which will print
		// 30 (As the scope is limited to Class)
		System.out.println("Class variable value After changing from Object Two -" + Assignment3_1.classVariable);
		System.out.println();
	}

}

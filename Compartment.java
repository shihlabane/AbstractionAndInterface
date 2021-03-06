package Compartment;

/*
 
 Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.
public abstract String notice();
Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.
Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
 
 */

public abstract class Compartment {
	

	public abstract String notice();

}

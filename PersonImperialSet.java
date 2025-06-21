// Name: Elijah Connick
// Email: econnick@cnm.edu
//Class: cs2251
// Assignment: HR part 2
// Purpose: more file reading practice.
//practice implements, classes, inheritance, and composition

public class PersonImperialSet extends PersonSet
{
	@Override
	public void add(Person person)
	{
		//cm to inches conversion
		double heightInInches = person.getHeight() * .3937;
		//kg to pounds conversion
		double weightInPounds = person.getWeight() * 2.20;
		//new person instance with American stats
		Person American = new Person(person.getName(), heightInInches, weightInPounds);
		
		//reuse parents add method
		super.add(American);
	}
}
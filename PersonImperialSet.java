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
		Person American = new Person
		(person.getName(), heightInInches, weightInPounds);
		
		//reuse parents add method
		super.add(American);
	}
	//to string override in this class to avoid confusion in personset
	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		
		//imperial-specific header with format
		result.append(String.format
		("%-12s %-12s %-12s%n", "Name", "Height(in)", "Weight(lb)"));
		for (Person p : getPeople())
		{
			//matching data formatting and spacing
			result.append(String.format("%-12s %-12.2f %-12.2f%n",
			p.getName(), p.getHeight(), p.getWeight()));
		}
		return result.toString();
	}
}
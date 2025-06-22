// Name: Elijah Connick
// Email: econnick@cnm.edu
//Class: cs2251
// Assignment: HR part 2
// Purpose: more file reading practice.
//practice implements, classes, inheritance, and composition

import java.util.Collections;

public class PersonOrderedSet extends PersonSet
{
	@Override
	public void add(Person person)
	{
		//reuse of duplicate check
		super.add(person);
		//java sort method
		Collections.sort(getPeople());
	}
}
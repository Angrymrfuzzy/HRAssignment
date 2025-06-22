// Name: Elijah Connick
// Email: econnick@cnm.edu
//Class: cs2251
// Assignment: HR
// Purpose: more file reading practice.
//practice implements, classes, inheritance, and composition

import java.util.ArrayList;

public class PersonSet implements PersonList
{
	private ArrayList<Person> people = new ArrayList<>();
	
	//overrides suggested by tutor to help in case of compiling error
	@Override
	public void add (Person peeps)
	{
		//making sure list doesn't already contain person
		if (!people.contains(peeps))
		{
			people.add(peeps);
		}
	}
	
	@Override
	public Person get(int index)
	{
		if (index >= 0 && index < people.size())
		{
			return people.get(index);
		}
		else
		{
			return null;
		}
	}
	//needed size return for size check in main
	public int size() 
	{
        return people.size();
    }
	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		 
		for (Person p : people) 
		{
			result.append(p.toString()).append("\n");
		}
		return result.toString();
	}
	//new helper method to give PersonOrderedSet access to list
	protected ArrayList<Person> getPeople()
	{
		return people;
	}
}
	
	
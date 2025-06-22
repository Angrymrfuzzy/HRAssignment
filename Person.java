// Name: Elijah Connick
// Email: econnick@cnm.edu
//Class: cs2251
// Assignment: HR
// Purpose: more file reading practice.
//practice implements, classes, inheritance, and composition

public class Person
{
	private String name;
	private double height;
	private double weight;
	
	//constructor for person
	public Person(String name, double height, double weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	//getters for constructor
	public String getName()
	{
		return name;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	//toString override using same getters
	@Override
	public String toString()
	{
		return name + ", " + height + ", " + weight;
	}
	
	//Equals method outline
	@Override
	public boolean equals(Object obj)
	{
		//if obj is null then return false
		if (obj == null)
		{
			return false;
		}
		//if obj == this then return true
		if (obj == this)
		{
			return true;
		}
		//if obj is not an instance of Person then return false
		if (!(obj instanceof Person)) 
		{
			return false;
		}
		//Declare a new variable of type Person (perhaps named p) 
		//	and assign it to Object obj cast as type Person
		Person p = (Person) obj;

		//if Person p has the same name, height, and weight as 
		//	this (obj) then return true
		if (this.name.equals(p.name) &&
			this.height == p.height &&
			this.weight == p.weight)
		{
				return true;
		}	
		//else return false
		else
		{
			return false;
		}
		//needed interface for collection sorting 
		
		/*if i'm understanding correctly, this creates a 
		new instance of the person class but one being sort of 
		a container, in order to compare against itself.*/
		public class Person implements Comparable<Person>
		{
			@Override
			public int compareTo(Person other)
			{
				return this.name.compareToIgnoreCase(other.name);
			}
		}
	}
}
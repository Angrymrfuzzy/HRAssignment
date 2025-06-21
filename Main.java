// Name: Elijah Connick
// Email: econnick@cnm.edu
//Class: cs2251
// Assignment: HR
// Purpose: more file reading practice.
//practice implements, classes, inheritance, and composition
/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?

Composition, car HAS an engine.

Q2: Color and Red are related
by which, Inheritance or Composition?

Inheritance, red IS a color.

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?

Inheritance, shirt IS a type of clothing.

Q4: Furniture and Desk are related
by which, Inheritance or Composition?

Inheritance, desk IS a type of furniture.

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?

Composition, phone HAS a battery.
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	
	
	
	public static void main(String[] args) 
	{
		if (args.length < 1) 
			{
				System.out.println("Please provide the filename.");
				return;
			}
		PersonSet personSet = new PersonSet();
		PersonImperialSet imperialSet = new PersonImperialSet();
		try
		{
			
			Scanner fileReader = new Scanner(new File(args[0]));
			
			//intentional line skip
			if (fileReader.hasNextLine())
			{
				fileReader.nextLine();
			}
			
			//read in data we actually want
			while (fileReader.hasNext())
			{
				String name = fileReader.next();
				double height = fileReader.nextDouble();
				double weight = fileReader.nextDouble();
				
				Person person = new Person(name, height, weight);
				imperialSet.add(person);
			}
			
			//Close your scanner!
			fileReader.close();
		}
		catch (Exception e)
		{
			System.out.println("Error reading file");
		}
		
		System.out.println(imperialSet);
		/*try
		{	
			FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
			fileWriterOrder.write("testing");
			fileWriterOrder.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}*/
	}
}

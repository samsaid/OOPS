// Assignment #: 5
// Arizona State University - CSE205
//         Name: Samira Said
//    StudentID: 1210662853
//      Lecture: TTH 3:00p
//  Description: The Assignment 5 class displays a menu of choices
//               (add cylinder soup, box soup,search soup,
//               list soups, quit, display menu) to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

public class Assignment5
{
	public static void main (String[] args)
	{
		char input1;
		String inputInfo = new String();
		String line = new String();
		boolean operation;

		// ArrayList object is used to store soup objects
		ArrayList <Soup> soupList = new ArrayList <Soup>();

		try
		{
			printMenu();     // print out menu

			// create a BufferedReader object to read input from a keyboard
			InputStreamReader isr = new InputStreamReader (System.in);
			BufferedReader stdin = new BufferedReader (isr);

			do
			{
				System.out.println("What action would you like to perform?");
				line = stdin.readLine().trim();
				input1 = line.charAt(0);
				input1 = Character.toUpperCase(input1);

				if (line.length() == 1)
				{
					switch (input1)
					{
					case 'A':   //Add Soup
						System.out.print("Please enter some soup information to add:\n");
						inputInfo = stdin.readLine().trim();
						//HERE
						Soup mySoup = SoupParser.parseStringToSoup(inputInfo);
						soupList.add(mySoup);

						break;
					case 'C':   //Compute Total Prices
						
						//HERE
						for(int i = 0; i<soupList.size(); i++)
						{
							((Soup) soupList.get(i)).computeTotalPrice();
						}
						
						System.out.print("total prices computed\n");
						break;
					case 'D':   //Search for Soup
						System.out.print("Please enter a soupID to search:\n");
						inputInfo = stdin.readLine().trim();
						operation = false;
						
						//HERE
						for(int i = 0; i<soupList.size(); i++){
							if(inputInfo.equals(((Soup)soupList.get(i)).getSoupId())){
								operation = true;
							}
						}
						
						if (operation == true)
							System.out.print("soup found\n");
						else
							System.out.print("soup not found\n");
						break;
					case 'L':   //List Soups
						
						//HERE	
						for(int i = 0; i<soupList.size(); i++){
							System.out.println(soupList.get(i).toString());						
						}
						
						break;
					case 'Q':   //Quit
						break;
					case '?':   //Display Menu
						printMenu();
						break;
					default:
						System.out.print("Unknown action\n");
						break;
					}
				}
				else
				{
					System.out.print("Unknown action\n");
				}
			} while (input1 != 'Q'); // stop the loop when Q is read
		}
		catch (IOException exception)
		{
			System.out.println("IO Exception");
		}
	}

	/** The method printMenu displays the menu to a use **/
	public static void printMenu()
	{
		System.out.print("Choice\t\tAction\n" +
				"------\t\t------\n" +
				"A\t\tAdd Soup\n" +
				"C\t\tCompute Total Prices\n" +
				"D\t\tSearch for Soup\n" +
				"L\t\tList Soups\n" +
				"Q\t\tQuit\n" +
				"?\t\tDisplay Help\n\n");
	}
}


// Assignment #: 2
// Arizona State University - CSE205
// Name: Samira Said 
// Lecture: 3:00p
// Description: This program reads in an unspecified number of integers from standard input and performs calculations 
// on the inputted numbers

import java.util.Scanner;  // use the Scanner class located in the "java.util" directory

public class Assignment2 
{
	public static void main (String[] args) 
	{
		//initialize scanner
		Scanner console = new Scanner(System.in);
		int number;

		int min = 0;
		int sum = 0;
		int totalCount = 0;
		int countOfEvenIntegers = 0;

		do{
			number = console.nextInt();

			
			//finds minimum
			if (number < min)
			{
				min = number;
			}
			
			//counts sum of positive integers 
			if (number > 0) 
			{
				sum += number;
			}
			//counts how many even integers
			if (number%2== 0)
			{
				countOfEvenIntegers++;
			}
		
			totalCount++;

		}while( number != 0);

		System.out.println("The minimum integer is " + min);
		System.out.println("The count of integers is " + totalCount);
		System.out.println("The sum of positive integers is " + sum);
		System.out.println("The count of even integers in the sequence is " + countOfEvenIntegers);

	}
}

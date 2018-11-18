// Description: Assignment 4 class displays a menu of choices to a user
//        and performs the chosen task. It will keep asking a user to
//        enter the next choice until the choice of 'Q' (Quit) is entered.

import java.io.*;    //to use InputStreamReader and BufferedReader
import java.util.*;

public class Assignment4
 {
  public static void main (String[] args)
   {
       // local variables, can be accessed anywhere from the main method
       char input1 = 'Z';
       String inputInfo;
       String airlines, depCity, depTime, depDate, arrCity, arrTime, arrDate;
       int flightNumber;
       String line = new String();

       // instantiate a Flight object
       Flight flight1 = new Flight();

       printMenu();

       //Create a Scanner object to read user input
       Scanner scan = new Scanner(System.in);

       do  // will ask for user input
        {
         System.out.println("What action would you like to perform?");
         line = scan.next();

         if (line.length() == 1)
          {
           input1 = line.charAt(0);
           input1 = Character.toUpperCase(input1);

           // matches one of the case statement
           switch (input1)
            {
             case 'A':   //Add Flight
               System.out.print("Please enter the flight information:\n");
               System.out.print("Enter its airlines:\n");
               airlines = scan.next();
               flight1.setAirlines(airlines);

               System.out.print("Enter its flight number:\n");
               flightNumber = scan.nextInt();
               flight1.setFlightNum(flightNumber);

               System.out.print("Enter its departure city:\n");
               depCity = scan.next();
               System.out.print("Enter its departure time:\n");
               depTime = scan.next();
               System.out.print("Enter its departure date:\n");
               depDate = scan.next();
               flight1.setDeparture(depCity, depTime, depDate);

               System.out.print("Enter its arrival city:\n");
               arrCity = scan.next();
               System.out.print("Enter its arrival time:\n");
               arrTime = scan.next();
               System.out.print("Enter its arrival date:\n");
               arrDate = scan.next();
               flight1.setArrival(arrCity, arrTime, arrDate);
               break;
             case 'D':   //Display course
               System.out.print(flight1);
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
        } while (input1 != 'Q' || line.length() != 1);
   }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                        "------\t\t------\n" +
                        "A\t\tAdd Flight\n" +
                        "D\t\tDisplay Flight\n" +
                        "Q\t\tQuit\n" +
                        "?\t\tDisplay Help\n\n");
  }
}

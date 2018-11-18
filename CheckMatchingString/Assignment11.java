// Description: Assignment 11 class displays a menu of choices to a user
//        and performs the chosen task. It will keep asking a user to
//      enter the next choice until the choice of 'Q' (Quit) is entered.

import java.io.*;

public class Assignment11
 {
  public static void main (String[] args) throws IOException
   {
       char input1;
       String inputInfo;
       String line = new String();

       printMenu();

       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader stdin = new BufferedReader(isr);

       do  // will ask for user input
        {
         System.out.println("What action would you like to perform?");
         line = stdin.readLine();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)
          {
           // matches one of the case statements
           switch (input1)
            {
             case 'P':   //Enter String
               System.out.print("Please enter a string.\n");
               inputInfo = stdin.readLine().trim();
               int result = Matching.checking(inputInfo);
               if (result == 0)
                    System.out.println("Everything is matching");
               else if (result == 1)
                    System.out.println("right parenthesis does not have its matching left parenthesis");
               else if (result == 2)
                    System.out.println("left parenthesis does not have its matching right parenthesis");
               else if (result == 3)
                    System.out.println("right brace does not have its matching left brace");
               else if (result == 4)
                    System.out.println("left brace does not have its matching right brace");
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


  /** The method printMenu displays the menu to a user**/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                        "------\t\t------\n" +
                        "P\t\tEnter String\n" +
                        "Q\t\tQuit\n" +
                        "?\t\tDisplay Help\n\n");
  }
}

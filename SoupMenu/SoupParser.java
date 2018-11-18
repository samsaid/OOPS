// Description: This utility class that will be used to create a soup object.


public class SoupParser {

	public static Soup parseStringToSoup(String lineToParse){
		
		//array storing children class constructors
		String[] words = lineToParse.split("/");
		
		Soup mySoup;
		String Str1 = ("Cylinder");
		String Str2 = ("Box");
				

		if(words[0].equals(Str1))
		{
			//create soup in cylinder
			mySoup = new SoupInCylinder(words[1], Double.parseDouble(words[2]),Integer.parseInt(words[3]), Integer.parseInt(words[4]));
		}
		
		else
		{
			//create soup in box object
			mySoup = new SoupInBox(words[1], Double.parseDouble(words[2]),Integer.parseInt(words[3]), Integer.parseInt(words[4]), Integer.parseInt(words[5]));
		}
		return mySoup;
	}
}

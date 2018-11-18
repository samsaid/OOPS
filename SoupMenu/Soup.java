// Description: This class is the main (parent) abstract class represents the basic attributes of 
// any soup in a contain to be sold on the menu.


import java.text.NumberFormat;
import java.text.DecimalFormat;

//this is an abstract class
//parent class
public abstract class Soup 
{
	

		//instantiate decimal format
		DecimalFormat fmt = new DecimalFormat("0.0000");	
		//instantiate number format
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		//instance variables

		//volume of soup
		protected int volume;
		//price per unit of soup
		protected double unitPrice;
		//total price of the soup
		protected double totalPrice;
		//id of the soup
		protected String soupId;
		

		//constructor
		public Soup(String id, double someUnitPrice){
			volume = 0;
			totalPrice = 0.0;
			unitPrice = someUnitPrice;
			soupId = id;
		}

		//accessor method
		public String getSoupId(){
			return soupId;
		}


		//abstaract method
		public abstract void computeTotalPrice();

		//toString method
		public String toString(){
			String result = "";
			result = "\n" + "The SoupId:"+ "\t" + "\t"+ soupId + "\n"
					+ "The Volume:" + "\t" + "\t" + volume + "\n"
					+ "The Unit Price:" + "\t" + "\t" + fmt.format(unitPrice) + "\n"
					+"The Total Price:" + "\t" + currency.format(totalPrice) + "\n" + "\n";
			return result;
		}
		}


	


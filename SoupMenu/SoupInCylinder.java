// Description: Child (subclass) of SoupClass that will define radius, height, and price of the soup in cylinder.

//daughter of SoupClass
public class SoupInCylinder extends Soup {
 
	//radius of the cylinder of the soup
	private int radius;
	//height of the cylinder of the soup
	private int height;
	
	
	//constructor
	public SoupInCylinder(String id, double someUnitPrice, int someRadius, int someHeight){
	super(id, someUnitPrice);
	radius = someRadius;
	height = someHeight;
	}
	
	//method #1
	public void computeTotalPrice(){
	volume = (int) ((radius * radius * height)*(Math.PI));
	totalPrice = (volume * unitPrice);
	}
	
	//toString method
	public String toString(){
		String result = "";
		result ="\n" + "The Soup in a Cylinder Container" + "\n"
				+ "The Radius:" + "\t" + "\t" + radius + "\n"
				+ "The Height:" + "\t" + "\t" + height + "\n"
				+ super.toString();
		return result;
	}	
}

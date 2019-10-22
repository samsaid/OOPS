// Description: Child (subclass) of Soup that represents the soup in a carton by defining its height, radius, and price.

//son class of Soupclass
public class SoupInBox extends Soup {
	//height of the box of soup
	private int height;
	//width of the box of soup
	private int width;
	//depth of the box of soup
	private int depth;
	
	//constructor
	public SoupInBox(String id, double someUnitPrice, int someHeight, int someWidth, int someDepth){
		super(id, someUnitPrice);
		height = someHeight;
		width = someWidth;
		depth = someDepth;
	}
	//method #1
	public void computeTotalPrice(){
		volume = (int) (height * width * depth);
		totalPrice = (int) (volume * unitPrice);
	}
	//method #2
	public String toString(){
		String result = "";
		result ="\n" + "The Soup in a Box Container" + "\n"
				+ "The Height:" + "\t" + "\t" + height + "\n"
				+ "The Width:" + "\t" + "\t" + width + "\n"
				+ "The Depth:" + "\t" + "\t" + depth + "\n"
				+ super.toString()	;
		return result;
	}
}

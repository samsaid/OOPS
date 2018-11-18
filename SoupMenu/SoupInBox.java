// Assignment #: 5
// Arizona State University - CSE205
// Name: Samira Said
// StudentID: 1210662853
// Lecture: TTH 3:00p
// Description: represents a soup in a carton

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
	//hello hoe pls work
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

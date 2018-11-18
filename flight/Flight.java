// Assignment #: 4
// Arizona State University - CSE205
// Name: Samira Said 
// StudentID: 1210662853
// Lecture: 3:00p
// Description: flights for assignment4

//class name
public class Flight {

	private String airlines;
	private int flightNum;
	private Schedule departure;
	private Schedule arrival;

	//constructor
	public Flight(){
		airlines = "?";
		flightNum = 0;

		//objects
		departure = new Schedule();
		arrival = new Schedule();
	}

	//accessor method #1
	public String getAirlines(){
		return airlines;
	}

	//accessor method #2
	public int getFlightNum(){
		return flightNum;
	}

	//accessor method #3
	public Schedule getDeparture(){
		return departure;
	}

	//accessor method #4
	public Schedule getArrival(){
		return arrival;
	}

	//mutator method #1
	public void setAirlines(String airlinesName){
		airlines = airlinesName;
	}
	//mutator method #2
	public void setFlightNum(int number){
		flightNum = number;
	}

	//method method #3
	public void setDeparture(String someCity, String someTime, String someDate){
		departure.setCity(someCity);
		departure.setTime(someTime);
		departure.setDate(someDate);
	}

	//mutator method #4
	public void setArrival(String someCity, String someTime, String someDate){
		arrival.setCity(someCity);
		arrival.setTime(someTime);
		arrival.setDate(someDate);
	}

	//toString method
	public String toString(){
		String result = "\n" + "Airlines:" + "\t"+ airlines  
				+ "\n" + "Number:" + "\t" + "\t"+ flightNum + "\n" 
				+ "Departure:" + "\t" + departure.getCity() + "," + departure.getDate() + ","+ departure.getTime()+"\n"
				+ "Arrival:" + "\t" + arrival.getCity() + "," + arrival.getDate() +","+ arrival.getTime()+ "\n" +"\n";
		return result;
	}
}


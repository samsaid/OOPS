//Description: Gets information (city,time) for departure or arrival of a flight.

public class Schedule {
	//instance variables
	//city of departure/arrival
	private String city;
	//date of departure/arrival
	private String date;
	//time of departure/arrival
	private String time;

	//constructor
	public Schedule(){
		city = "?";
		date = "?";
		time = "?";
	}

	//accessor method # 1
	public String getCity(){
		return city;
	}

	//accessor method #2
	public String getDate(){
		return date;
	}

	//accessor method # 3
	public String getTime(){
		return time;
	}

	//mutator method # 1
	public void setCity(String someCity){
		city = someCity;
	}

	//mutator method # 2
	public void setDate(String someDate){
		date = someDate;
	}

	//mutator method # 3
	public void setTime(String someTime){
		time = someTime;
	}

	//toString method
	public String toString(){
		return city + "," + date + "," + time;
	}
}

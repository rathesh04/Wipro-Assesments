package rathesh;

public class Weatherdata {
	public static void main(String[] args) {
		String city = "Hyderabad";
		double temperature = 22 ;
		boolean isHotDay = temperature > 30;
		{
			if(isHotDay)
				{System.out.println("city :"+ city);
				System.out.println("Temperature :"+ temperature);
				System.out.print("Condition : Hot day");
				}
			else
				{System.out.println("City: " + city);
			System.out.println("Temperature: " + temperature + "°C");
			System.out.println("Condition: Normal Day");}
				
		}
		 Weatherdata record = new Weatherdata(); 
	        record = null;
		
				
	}

}

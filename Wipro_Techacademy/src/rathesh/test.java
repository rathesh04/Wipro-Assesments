package rathesh;


interface vehicle
{
	void start();
	
	default void fuelType()
	{
		System.out.println("Fueled");
	}
	
}
class carss implements vehicle{
	public void start()
	{
		System.out.println("Started");
	}
}
public class test {
public static void main(String[] args)
	{
 
	vehicle v=new carss();
	v.start();
	v.fuelType();
	
	}
}

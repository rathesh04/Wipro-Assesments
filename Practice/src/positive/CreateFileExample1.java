package positive;
 
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class CreateFileExample1
{
public static void main(String[] args)
{
try {
	FileWriter fw = new FileWriter("Tech.txt");
	fw.write("Hello welcome");
	fw.close();
	System.out.println("File written successfully");	
}

catch(IOException e)
{
	e.printStackTrace();
}
}
 
}
 
 
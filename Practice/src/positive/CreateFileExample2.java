package positive;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
public class CreateFileExample2
{
public static void main(String[] args)
{
try {
	BufferedReader br = new BufferedReader(new FileReader("Tech.txt"));
	String line;
	while((line=br.readLine())!= null)
	{
		System.out.println(line);
	}br.close();
}
catch(IOException e)
{
	e.printStackTrace();
}
}
}

 
 
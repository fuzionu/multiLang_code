import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class fileLoader
{	
	public static void main(String[] args)
	{
		File file = new File("dupa.txt");
		Path path = Path.of("dupa.txt");
		
		try
		{
			if (file.isFile())
			{
				String text = Files.readString(path);
				System.out.print(text);
			}
			else
			{
				System.out.print("Nie ma takiego pliku wariacie");
			}
		}
		catch (IOException e)
		{
			System.out.print("Error");
		}
	}
}



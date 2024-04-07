import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class fileLoader
{	
	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.print("Podaj nazwe pliku byku");
		}
		
		else if (args.length > 1)
		{
			System.out.print("Podaj tylko jeden plik");
		}
		
		else 
		{
			File file = new File(args[0]);
			Path path = Path.of(args[0]);
		
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
}



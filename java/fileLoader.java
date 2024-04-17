import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class fileLoader
{	
	public static void main(String[] args)
	{
		new fileLoader().Cli(args);
	}
	
	public void Cli(String[] args)
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
		
			if (file.isFile())
			{
				Path path = Path.of(args[0]);
			
				try
				{
					String text = Files.readString(path);
										
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(reverse(text));
					fileWriter.close();
					
					System.out.print("Poprawnie odwrocono tresc pliku");
				}
				
				catch (IOException e)
				{
					System.out.print("Error.");
				}
			}
			
			else
			{
				System.out.print("Nie ma takiego pliku wariacie");
			}
		}
	}
	
	public String reverse(String text)
	{
		String words[] = text.split("\\s");
		String reversedWord="";
		
		for(String w:words)
		{
			StringBuilder stringBuilder = new StringBuilder(w);
			stringBuilder.reverse();
			
			reversedWord += stringBuilder.toString()+" ";
		}
		
		return reversedWord;
	}
	
}
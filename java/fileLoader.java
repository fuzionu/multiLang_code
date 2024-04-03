import java.io.File;
import java.io.IOException;

public class fileLoader
{	
	public static void main(String[] args)
	{
		File file = new File("dupa.txt");
			
		if (file.isFile())
		{
			System.out.print("Wszystko git, plik jest mordo");
		}
		else
		{
			System.out.print("Nie ma takiego pliku wariacie");
		}
	}
}



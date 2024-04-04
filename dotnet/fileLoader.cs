using System;
using System.IO;

class fileLoader
{
	static public void Main(String[] args)
	{
		
		if (args.Length == 0)
		{
			Console.WriteLine("Podaj nazwe pliku byku");
		}
		
		else if (args.Length > 1)
		{
			Console.WriteLine("Podaj tylko jeden plik");
		}
		
		else if (File.Exists(args[0]))
		{
			string text = File.ReadAllText(args[0]);
			Console.WriteLine(text);
		}
		
		else
		{
			Console.WriteLine("Nie ma takiego pliku wariacie");
		}
	}
}



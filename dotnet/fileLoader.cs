using System;
using System.IO;

class fileLoader
{
	static public void Main(String[] args)
	{		
		new fileLoader().Cli(args);
	}
	
	public void Cli(String[] args)
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
			string reversedText = this.Reverse(text);
			
			File.WriteAllText(args[0], reversedText);
			Console.WriteLine("Poprawnie odwrócono treść pliku");
		}
		
		else
		{
			Console.WriteLine("Nie ma takiego pliku wariacie");
		}
	}
	
	public string Reverse (string text)
	{		
		char[] array = text.ToCharArray();
		Array.Reverse(array);
		return new String(array);
	}
}
using System;
using System.IO;

class fileLoader
{
	static public void Main(String[] args)
	{
		if(File.Exists("dupa.txt"))
		{
			string text = File.ReadAllText("dupa.txt");
			Console.WriteLine(text);
		}
		else
		{
			Console.WriteLine("Nie ma takiego pliku wariacie");
		}
	}
}



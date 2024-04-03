using System;
using System.IO;

class fileLoader
{
	static public void Main(String[] args)
	{
		if(File.Exists("dupa.txt"))
		{
			Console.WriteLine("Wszystko git, jest plik wariacie");
		}
		else
		{
			Console.WriteLine("Nie ma takiego pliku wariacie");
		}
	}
}



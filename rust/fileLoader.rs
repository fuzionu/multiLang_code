use std::path::Path;
use std::fs;
use std::env;

fn main()
{
	let args: Vec<_> = env::args().collect();
	
	if args.len() == 1
	{
		print!("Podaj nazwe pliku byku");
	}
	
	else if args.len() > 2
	{
		print!("Podaj tylko jeden plik");
	}
	
	else if Path::new(&args[1]).exists()
	{
		let text = fs::read_to_string(&args[1]).expect("Unable to read file");
		fs::write(&args[1], &text.chars().rev().collect::<String>()).expect("Unable to write file");
		
		print!("Poprawnie odwrocono tresc pliku");
	}
	else
	{
		print!("Nie ma takiego pliku wariacie");
	}
}
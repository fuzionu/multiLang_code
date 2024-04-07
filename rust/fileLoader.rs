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
		fs::write(&args[1], "overwritten").expect("Unable to write file");
	}
	else
	{
		print!("Nie ma takiego pliku wariacie");
	}
}
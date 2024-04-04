use std::path::Path;
use std::fs;

fn main()
{
	if Path::new("dupa.txt").exists()
	{
		let text = fs::read_to_string("dupa.txt").expect("Unable to read file");
		print!("{}", text);
	}
	else
	{
		print!("Nie ma takiego pliku wariacie");
	}
}
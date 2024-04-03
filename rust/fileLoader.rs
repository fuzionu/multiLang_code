use std::path::Path;

fn main()
{
	if Path::new("dupa.txt").exists()
	{
		print!("Wszystko git, jest plik wariacie");
	}
	else
	{
		print!("Nie ma takiego pliku wariacie");
	}
}
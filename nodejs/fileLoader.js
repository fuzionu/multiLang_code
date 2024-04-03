const file = require("fs");

if(file.existsSync("dupa.txt"))
{
	console.log("Wszystko git, jest plik mordo");
}
else
{
	console.log("Nie ma takiego pliku wariacie");
}
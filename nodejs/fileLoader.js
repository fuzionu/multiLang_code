const file = require("fs");

if(file.existsSync("dupa.txt"))
{
	const text = file.readFileSync("./dupa.txt").toString('utf-8');
	console.log(text);
}
else
{
	console.log("Nie ma takiego pliku wariacie");
}
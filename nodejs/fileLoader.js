const file = require("fs");

if (process.argv.length == 2)
{
	console.error("Podaj nazwe pliku byku");
}

else if (process.argv.length > 3)
{
	console.error("Podaj tylko jeden plik");
}

else if (file.existsSync(process.argv[2]))
{
	file.writeFile(process.argv[2], "overwritten", (err) =>
	{ if (err) throw err; });
}
else
{
	console.log("Nie ma takiego pliku wariacie");
}
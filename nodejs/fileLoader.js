const file = require("fs");

if (process.argv.length == 2)
{
	console.error("Podaj nazwe pliku byku");
	process.exit(1);
}

else if (process.argv.length > 3)
{
	console.error("Podaj tylko jeden plik");
}

else if (file.existsSync(process.argv[2]))
{
	const text = file.readFileSync(process.argv[2]).toString('utf-8');
	console.log(text);
}
else
{
	console.log("Nie ma takiego pliku wariacie");
}
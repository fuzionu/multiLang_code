function reverse(text) 
{
	return text.split("").reverse().join("").split(" ").reverse().join(" ");
}

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
	const text = file.readFileSync(process.argv[2]).toString('utf-8');
		
	file.writeFile(process.argv[2], reverse(text), (err) =>
	{ if (err) throw err; });
	
	console.error("Poprawnie odwrocono tresc pliku");
}
else
{
	console.log("Nie ma takiego pliku wariacie");
}
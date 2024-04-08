<?php
	if (!isset($argv[1]))
		echo "Podaj nazwe pliku byku";
	
	else if (count($argv) > 2)
		echo "Podaj tylko jeden plik";
		
	else if (file_exists($argv[1]))
	{
		$path = $argv[1];
		$text = file_get_contents($path);
		
		file_put_contents($path, strrev($text));
		echo "Poprawnie odwrocono tresc pliku";
	}
	
	else
		echo "Nie ma takiego pliku wariacie";

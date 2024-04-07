<?php
	if (!isset($argv[1]))
		echo "Podaj nazwe pliku byku";
	
	else if (count($argv) > 2)
		echo "Podaj tylko jeden plik";
		
	else if (file_exists($argv[1]))
	{
		$path = $argv[1];
		file_put_contents($path, 'overwritten');
	}
	
	else
		echo "Nie ma takiego pliku wariacie";

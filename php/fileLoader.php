<?php
	if (!isset($argv[1]))
		echo "Podaj nazwe pliku byku";
	
	else if (count($argv) > 2)
		echo "Podaj tylko jeden plik";
		
	else if (file_exists($argv[1]))
		echo file_get_contents($argv[1]);
	
	else
		echo "Nie ma takiego pliku wariacie";
?>




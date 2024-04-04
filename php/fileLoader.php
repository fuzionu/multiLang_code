<?php
	if (file_exists("dupa.txt"))
		echo file_get_contents("dupa.txt");
	else
		echo "Nie ma takiego pliku wariacie";
?>




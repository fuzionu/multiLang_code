import os
import sys

def main():
	if len(sys.argv) == 1:
		print("Podaj nazwe pliku byku")
	
	elif len(sys.argv) > 2:
		print("Podaj tylko jeden plik")
		
	elif os.path.isfile(sys.argv[1]):
		print(open(sys.argv[1]).read())		
		
	else:
		print("Nie ma takiego pliku wariacie")
	
	
	
if __name__ == "__main__":
	main()
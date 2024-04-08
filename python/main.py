import os
import sys

def reverse(text):
	return text[::-1]

def main():
	if len(sys.argv) == 1:
		print("Podaj nazwe pliku byku")
	
	elif len(sys.argv) > 2:
		print("Podaj tylko jeden plik")
		
	elif os.path.isfile(sys.argv[1]):
		fileRead = open(sys.argv[1])
		text = reverse(fileRead.read())
		fileRead.close()
				
		fileWrite = open(sys.argv[1], "w")
		fileWrite.write(text)
		fileWrite.close()
		
		print("Poprawnie odwrocono tresc pliku")
		
	else:
		print("Nie ma takiego pliku wariacie")
	
	
	
if __name__ == "__main__":
	main()
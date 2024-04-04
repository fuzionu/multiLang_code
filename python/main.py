import os

def main():
	if os.path.isfile("dupa.txt"):
		print(open("dupa.txt").read())		
	else:
		print("Nie ma takiego pliku wariacie")
	
	
	
if __name__ == "__main__":
	main()
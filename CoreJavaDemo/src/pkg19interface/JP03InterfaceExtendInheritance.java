package pkg19interface;

interface Memory {

 	void writeData();
}

interface DVDRomMem extends Memory {

 	int DVD_WRITE_SPEED = 80;
 	int DVD_READ_SPEED = 160;
 	void writeDataDVD();
}

class Storage implements DVDRomMem {

 	public void writeData() {
 		
  		System.out.println("Memory write data");
 	}

 	public void writeDataDVD() {
 		
  		System.out.println("DVD ROM write speed: " + DVD_WRITE_SPEED);
 	}
}


public class JP03InterfaceExtendInheritance {

	public static void main(String[] args) {

		Storage stoObj = new Storage();
		stoObj.writeData();
		stoObj.writeDataDVD();
	}
}

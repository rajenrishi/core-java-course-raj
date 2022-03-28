package pkg19interface;

interface CDRomMI {

 	int CD_WRITE_SPEED = 40;
 	int CD_READ_SPEED = 80;
 	void writeDataCD();
}

interface DVDRomMI {

 	int DVD_WRITE_SPEED = 80;
 	int DVD_READ_SPEED = 160;
 	void writeDataDVD();
}

class ROMDiscMI implements CDRomMI, DVDRomMI {

 	public void writeDataCD() {
 		
  		System.out.println("CD ROM write speed: " + CD_WRITE_SPEED);
 	}

 	public void writeDataDVD() {
 		
  		System.out.println("DVD ROM write speed: " + DVD_WRITE_SPEED);
 	}
}

public class JP01InterfaceMultipleInheritanceDemo {

	public static void main(String[] args) {

		ROMDiscMI romObj = new ROMDiscMI();
		romObj.writeDataCD();
		romObj.writeDataDVD();
	}
}

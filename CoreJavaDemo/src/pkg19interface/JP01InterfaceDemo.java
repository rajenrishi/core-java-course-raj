package pkg19interface;

interface CDRom {

 	int WRITE_SPEED = 40;  // public static final
 	int READ_SPEED = 80;
 	void writeData();   // abstract
}

class ROMDisc implements CDRom {

 	public void writeData() {
 		
  		System.out.println("CD ROM write speed: " + WRITE_SPEED);
 	}
}

public class JP01InterfaceDemo {

	public static void main(String[] args) {

		ROMDisc romObj = new ROMDisc();
		romObj.writeData();
	}
}

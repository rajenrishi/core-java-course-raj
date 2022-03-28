package pkg19interface;

interface Computer {
	
    default void configuration() {

        System.out.println("CPU: i7");
        System.out.println("RAM: 16GB");
        System.out.println("Graphics: NVIDIA");
    }  
    
 	void setSerialNum();
}

class Devices implements Computer {

 	public void setSerialNum() {
 		
  		System.out.println("SN: 99898JH998");
 	}
}


public class JP04InterfaceDefaultMethodDemo {

	public static void main(String[] args) {

		Devices devObj = new Devices();
		devObj.configuration();
		devObj.setSerialNum();
	}
}

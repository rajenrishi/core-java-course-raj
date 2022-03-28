package pkg19interface;

interface ComputerSM {
	
    static void configuration() {

        System.out.println("CPU: i7");
        System.out.println("RAM: 16GB");
        System.out.println("Graphics: NVIDIA");
    }  
    
 	void setSerialNum();
}

class DevicesSM implements ComputerSM {

 	public void setSerialNum() {
 		
  		System.out.println("SN: 99898JH998");
 	}
}


public class JP05InterfaceStaticMethodDemo {

	public static void main(String[] args) {

		DevicesSM devObj = new DevicesSM();
		ComputerSM.configuration();
		devObj.setSerialNum();
	}
}

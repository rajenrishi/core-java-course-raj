package pkg19interface;

interface ComputerPM {
	
	default void callConfig() {
		
		configuration();
	}
	
    private void configuration() {

        System.out.println("CPU: i7");
        System.out.println("RAM: 16GB");
        System.out.println("Graphics: NVIDIA");
    }  
    
 	void setSerialNum();
}

class DevicesPM implements ComputerPM {

 	public void setSerialNum() {
 		
  		System.out.println("SN: 99898JH998");
 	}
}


public class JP06InterfacePrivateMethodDemo {

	public static void main(String[] args) {

		DevicesPM devObj = new DevicesPM();
		devObj.callConfig();
		devObj.setSerialNum();
	}
}

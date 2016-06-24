package AdapterMethod;

public class Main {

	public static void main(String[] args) {
		USBTypec usbTypec = new Car();
		USBTypecToMicroUSB tTom = new USBTypecToMicroUSB(usbTypec);
		tTom.process();
	}

}

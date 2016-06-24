package AdapterMethod;

//适配器,将USBTypec接口转换成MicroUSB
public class USBTypecToMicroUSB implements MicroUSB {

	USBTypec usbTypec;

	public USBTypecToMicroUSB(USBTypec usbTypec) {
		this.usbTypec = usbTypec;
	}

	public void process() {
		System.out.println("USBTypec接口转换成MicroUSB");
		// 补全,将USBTypec接口转换成MicroUSB接口
		usbTypec.process();
	}
}
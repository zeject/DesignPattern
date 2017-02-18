package 适配器模式;

public class Main {

	public static void main(String[] args) {
		IPower220 iPower220 = new Power220();
		iPower220.output220V();

		System.out.println("----220转12----");
		IPower12 adapterPower12 = new AdapterPower12(new Power220());
		adapterPower12.output12V();

		System.out.println("----类转换----");
		IPower12 adapterPower12Ext = new AdapterPower12Ext(new Power220());
		adapterPower12Ext.output12V();
		
	}

}

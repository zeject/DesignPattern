package 适配器模式;

public class Power220 extends AbsBasePower implements IPower220 {

	public Power220() {
		super(220);
	}

	@Override
	public void output220V() {
		// TODO Auto-generated method stub
		super.print();
	}

}

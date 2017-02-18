package 适配器模式;

public class Power12 extends AbsBasePower implements IPower12 {

	public Power12() {
		super(12);
	}

	@Override
	public void output12V() {
		// TODO Auto-generated method stub
		super.print();
	}

}

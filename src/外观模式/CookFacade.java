package 外观模式;

public class CookFacade implements ICookFacade {

	private final ISpareribs spareribs = new Spareribs();

	@Override
	public void cookSpareribs() {
		// TODO Auto-generated method stub
		this.spareribs.prepair();

		this.spareribs.preserve();

		this.spareribs.fry();

		this.spareribs.juice();
	}

}

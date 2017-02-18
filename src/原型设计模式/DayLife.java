package 原型设计模式;

public class DayLife implements Cloneable {

	private String getUp;

	private String byBus;

	public String getGetUp() {
		return getUp;
	}

	public void setGetUp(String getUp) {
		this.getUp = getUp;
	}

	public String getByBus() {
		return byBus;
	}

	public void setByBus(String byBus) {
		this.byBus = byBus;
	}

	public void print() {
		System.out.println("DayLife [getUp=" + this.getGetUp() + ", byBus=" + this.getByBus() + "]");
	}

	@Override
	protected DayLife clone() {
		// TODO Auto-generated method stub
		try {
			DayLife dayLife = (DayLife) super.clone();
			// List = List.clone(); 深复制
			return dayLife;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

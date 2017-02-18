package 原型设计模式;

public class MyLifeFactory implements ILifeFactory {

	private static DayLife dayLife = null;

	@Override
	public DayLife getNewInstance() {
		// TODO Auto-generated method stub
		if (dayLife == null) {
			System.out.println("new Day");
			dayLife = new DayLife();
			dayLife.setGetUp("7:00 起床");
			dayLife.setByBus("7:30 坐公交");
		} else {
			System.out.println("clone day");
			dayLife = dayLife.clone();
		}
		return dayLife;
	}

}

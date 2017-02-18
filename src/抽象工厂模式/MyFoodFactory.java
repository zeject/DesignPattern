package 抽象工厂模式;

public class MyFoodFactory implements IFoodFactory {

	@Override
	public Hamburg createHamburg(int num) {
		// TODO Auto-generated method stub
		return new MyHamBurg(num);
	}

	@Override
	public ChickenWings createChickenWings(int num) {
		// TODO Auto-generated method stub
		return new MyChickenWings(num);
	}

}

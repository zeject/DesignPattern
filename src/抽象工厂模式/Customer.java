package 抽象工厂模式;

public class Customer {

	private IFoodFactory iFoodFactory;

	public Customer(IFoodFactory iFoodFactory) {
		// TODO Auto-generated constructor stub
		this.iFoodFactory = iFoodFactory;
	}

	public float orderHamburg(int num) {
		Hamburg hamburg = iFoodFactory.createHamburg(num);
		hamburg.printMessage();
		return hamburg.totalPrice();
	}

	public float orderChickenWings(int num) {
		ChickenWings chickenWings = iFoodFactory.createChickenWings(num);
		chickenWings.printMessage();
		return chickenWings.totalPrice();
	}

}

package 抽象工厂模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(new MyFoodFactory());
		float hamburgPrice = customer.orderHamburg(3);
		float chickenWingsPrice = customer.orderChickenWings(20);
		System.out.println("总价:" + (hamburgPrice + chickenWingsPrice));
	}

}

package 原型设计模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILifeFactory ilf = new MyLifeFactory();
		DayLife dayLife2 = ilf.getNewInstance();

		DayLife dayLife = ilf.getNewInstance();
		dayLife.setGetUp("7:10 起床");
		dayLife.print();

		ilf.getNewInstance().print();
		dayLife2.print();
	}

}

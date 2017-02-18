package 装饰者模式;

public class Main {

	public static void main(String[] args) {
		System.out.println("====开始生产====");
		IBread normalBread = new NormalBread();
		// normalBread.process();
		// System.out.println("====生产完毕====");
		//
		// System.out.println("----染色馒头----");
		// IBread cornBread = new CornBread();
		// cornBread.process();

		normalBread = new SweetDecorator(normalBread);

		normalBread = new CornDecorator(normalBread);

		normalBread.process();

	}

}
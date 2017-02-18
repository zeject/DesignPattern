package 工厂方法模式;

public class Main {

	public static void main(String[] args) {
		ISwordFactory isf = new CaoCao();
		AbstractSword as = isf.createSword();
		System.out.println(as.getName());
	}

}

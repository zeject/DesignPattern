package 装饰者模式;

public class CornBread extends NormalBread {

	public void paint() {
		System.out.println("添加染色剂");
	}

	public void kneadFlour() {
		this.paint();
		super.kneadFlour();
	}

}

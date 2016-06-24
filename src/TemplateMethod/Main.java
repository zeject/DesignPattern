package TemplateMethod;

public class Main {

	public static void main(String[] args) {
		AbstractCheck ac = new Porsche911();
		// 开始检测911
		ac.check();
	}

}

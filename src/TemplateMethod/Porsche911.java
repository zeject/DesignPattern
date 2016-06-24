package TemplateMethod;

//检测911
public class Porsche911 extends AbstractCheck {
	@Override
	void startup() {
		System.out.println("检测911启动");
	}

	@Override
	void speeup() {
		System.out.println("检测911加速");
	}

	@Override
	void brake() {
		System.out.println("检测911刹车");
		// 检测方法标准
		System.out.println("911刹车合格");
	}

	@Override
	void stop() {
		System.out.println("检测911熄火");
	}
}
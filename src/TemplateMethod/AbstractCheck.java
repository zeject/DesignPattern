package TemplateMethod;

//抽象检测类(抽象模板方法)
public abstract class AbstractCheck {
	abstract void startup();

	abstract void speeup();

	abstract void brake();

	abstract void stop();

	// 防止子类覆盖使用final修饰
	public final void check() {
		startup();
		speeup();
		brake();
		stop();
	}

}
package ObserverMethod;

public class Main {

	public static void main(String[] args) {
		Factory f = new PorscheFactory();
		// 火灾报警器
		Alarm alarm = new FireAlarm();
		// 补全,工厂安装火灾报警器
		f.attach(alarm);
		// 补全,发生火灾了
		f.fire();
	}

}

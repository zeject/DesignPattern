package ObserverMethod;

// 火灾报警器(具体观察者)
class FireAlarm implements Alarm {
	// 火灾报警器观察到工厂发行火灾鸣笛
	public void rang() {
		System.out.println("发生工厂火灾了,鸣笛");
	}
}
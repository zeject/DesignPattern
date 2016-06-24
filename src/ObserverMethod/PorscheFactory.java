package ObserverMethod;

import java.util.ArrayList;

// 安装了报警器的工厂
class PorscheFactory implements Factory {

	ArrayList<Alarm> alarms = new ArrayList<Alarm>();

	public void attach(Alarm alarm) {
		alarms.add(alarm);
	}

	public void detach(Alarm alarm) {
		alarms.remove(alarm);
	}

	public void nofityObserver() {
		for (Alarm alarm : alarms) {
			alarm.rang();
		}
	}

	public void fire() {
		// 补全,工厂发生火灾,通知报警器
		nofityObserver();
	}
}
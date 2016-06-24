package ObserverMethod;

//安装火灾报警器的工厂
interface Factory {
	// 添加火灾报警器
	void attach(Alarm alarm);

	// 移除火灾报警器
	void detach(Alarm alarm);

	// 通知报警器
	void nofityObserver();

	// 发生火灾
	void fire();
	// ...
}
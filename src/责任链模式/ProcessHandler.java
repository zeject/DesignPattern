package 责任链模式;

public class ProcessHandler {

	// 单例模式
	private static ProcessHandler processHandler = new ProcessHandler();

	// 班长处理
	private final IHandler sqmshandler;
	// 老师处理
	private final IHandler techhandler;
	// 校长处理
	private final IHandler scmshandler;

	public ProcessHandler() {
		this.sqmshandler = new SquadLeaderHandler();
		this.techhandler = new TeacherHandler();
		this.scmshandler = new SchoolMasterHandler();
		this.sqmshandler.setHandler(this.techhandler);
		this.techhandler.setHandler(this.scmshandler);
	}

	// 获得单例对象
	public static ProcessHandler getInstance() {
		return processHandler;
	}

	/**
	 * 发送请假请求
	 * 
	 * @param student
	 */
	public void sendMessage(IStudent student) {
		this.sqmshandler.handlerRequest(student);
	}

}

package 责任链模式;

public abstract class AbsHandler implements IHandler {

	// 下一个处理者
	private IHandler handler;

	// 请假级别
	private int state = -1;

	public AbsHandler(int state) {
		this.state = state;
	}

	// 处理请求,交由子类负责进行具体的处理
	public abstract void process(IStudent student);

	public void handlerRequest(IStudent student) {
		// 如果学生对象存在
		if (student != null) {
			if (this.state == student.getState()) {
				this.process(student);
			} else {
				if (this.handler != null) {
					System.out.println("请求上级领导");
					this.handler.handlerRequest(student);
				}
			}
		}
	}

	@Override
	public void setHandler(IHandler handler) {
		// TODO Auto-generated method stub
		this.handler = handler;
	}

}

package 责任链模式;

public interface IHandler {

	// 处理请求
	public void handlerRequest(IStudent student);

	// 设置下一个处理者
	public void setHandler(IHandler handler);

}

package 责任链模式;

public interface IStudent {

	/**
	 * 获得学生病情
	 * 
	 * 0:班长可以处理
	 * 
	 * 1:班长无法处理,由老师处理
	 * 
	 * 2:老师无法处理,由校长处理
	 * 
	 * @return
	 */
	public int getState();

	/**
	 * 获得学生请假消息
	 * 
	 * @return
	 */
	public String getRequestMessage();

}

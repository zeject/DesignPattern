package 命令模式;

public interface IReceiver {

	/**
	 * 收件人收到信件读取
	 * 
	 * @param message
	 */
	public void readMail(String message);

}

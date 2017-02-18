package 桥接模式;

public interface ILight {

	// 接通电流
	public void electricConnected();

	// 照明
	public void light();

	// 断开电流
	public void electricClosed();

}

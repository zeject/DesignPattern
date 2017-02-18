package 责任链模式;

public class Student implements IStudent {

	private int state = -1;

	private final String message;

	public Student(int state, String message) {
		this.state = state;
		this.message = message;
	}

	@Override
	public int getState() {
		// TODO Auto-generated method stub
		return this.state;
	}

	@Override
	public String getRequestMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

}

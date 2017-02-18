package 责任链模式;

public class SquadLeaderHandler extends AbsHandler {

	public SquadLeaderHandler() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(IStudent student) {
		// TODO Auto-generated method stub
		System.out.println("班长 批复:" + student.getRequestMessage());
	}

}

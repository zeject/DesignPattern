package 责任链模式;

public class SchoolMasterHandler extends AbsHandler {

	public SchoolMasterHandler() {
		super(2);
	}

	@Override
	public void process(IStudent student) {
		// TODO Auto-generated method stub
		System.out.println("校长 :" + student.getRequestMessage());
	}

}

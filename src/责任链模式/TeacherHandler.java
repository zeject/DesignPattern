package 责任链模式;

public class TeacherHandler extends AbsHandler {

	public TeacherHandler() {
		super(1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(IStudent student) {
		// TODO Auto-generated method stub
		System.out.println("老师 批复:" + student.getRequestMessage());
	}

}

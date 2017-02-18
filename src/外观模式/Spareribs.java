package 外观模式;

public class Spareribs implements ISpareribs {

	@Override
	public void prepair() {
		// TODO Auto-generated method stub
		System.out.println("准备材料.......");
	}

	@Override
	public void preserve() {
		// TODO Auto-generated method stub
		System.out.println("清理材料,洗泡腌");
	}

	@Override
	public void fry() {
		// TODO Auto-generated method stub
		System.out.println("油炸材料");
	}

	@Override
	public void juice() {
		// TODO Auto-generated method stub
		System.out.println("最终调味");
	}

}

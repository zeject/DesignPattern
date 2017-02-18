package 责任链模式;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ProcessHandler processHandler = ProcessHandler.getInstance();

		Random random = new Random();

		for (int i = 0; i < 3; i++) {
			int radom = random.nextInt(3);
			System.out.println(radom);
			IStudent student = new Student(radom, "学生" + i + "要请假!");
			processHandler.sendMessage(student);
		}
		System.out.println("-------");
	}

}

package test3;

public class T {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Hello World")).start();
	}

	public static String abc(String string) {
		return string;
	}
}

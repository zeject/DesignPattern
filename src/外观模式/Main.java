package 外观模式;

public class Main {

	public static void main(String[] args) {
		ICookFacade cookFacade = new CookFacade();

		cookFacade.cookSpareribs();
	}

}

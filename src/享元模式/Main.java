package 享元模式;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		FiveChessmanFactory fiveChessmanFactory = FiveChessmanFactory.getInstance();
		// 随机数,用来随机生成棋子对象
		Random random = new Random();

		int radom = 0;

		AbsChessman absChessman = null;
		// 随机获得棋子
		for (int i = 0; i < 10; i++) {
			radom = random.nextInt(2);
			switch (radom) {
			case 0:
				absChessman = fiveChessmanFactory.getChessmanObject('B');
				break;
			case 1:
				absChessman = fiveChessmanFactory.getChessmanObject('W');
				break;
			default:
				break;
			}
			if (absChessman != null) {
				absChessman.point(i, random.nextInt(15));
			}
		}
	}

}

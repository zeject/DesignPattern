package 享元模式;

import java.util.Hashtable;

public class FiveChessmanFactory {

	// 单例模式工厂
	private static FiveChessmanFactory fiveChessmanFactory = new FiveChessmanFactory();

	// 缓存存放共享对象
	private final Hashtable<Character, AbsChessman> cache = new Hashtable();

	private FiveChessmanFactory() {
	}

	// 获得单例工厂
	public static FiveChessmanFactory getInstance() {
		return fiveChessmanFactory;
	}

	/**
	 * 根据字符获得棋子
	 * 
	 * @param c
	 *            (b:黑棋,w:白棋)
	 * @return
	 */
	public AbsChessman getChessmanObject(char c) {
		// 存缓存中获得棋子对象
		System.out.println("----" + cache.size());
		AbsChessman absChessman = this.cache.get(c);
		if (absChessman == null) {
			switch (c) {
			case 'B':
				absChessman = new BlackChessman();
				break;
			case 'W':
				absChessman = new WhiteChessman();
				break;
			default:
				break;
			}

			// 防止非法字符
			if (absChessman != null) {
				this.cache.put(c, absChessman);
			} else {
				return null;
			}
		}
		return absChessman;
	}

}

package 解释器模式;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Context {

	// 待解析的文本内容
	private final StringTokenizer stringTokenizer;
	// 当前命令
	private String currentToken;
	// 用来存储动态变化信息内容
	private final Map<String, Object> map = new HashMap<String, Object>();

	public Context(String text) {
		// 使用空格分个待解析文本内容
		this.stringTokenizer = new StringTokenizer(text);
	}

	/**
	 * 解析文本
	 * 
	 * @return
	 */
	public String next() {
		if (this.stringTokenizer.hasMoreTokens()) {
			currentToken = this.stringTokenizer.nextToken();
		} else {
			currentToken = null;
		}
		return currentToken;
	}

}

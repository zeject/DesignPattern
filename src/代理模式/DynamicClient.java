package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicClient {

	public static void main(String[] args) {
		InvocationHandler handler = new TargetImpl();

		ITarget target = (ITarget) Proxy.newProxyInstance(ITarget.class.getClassLoader(), new Class[] { ITarget.class },
				handler);
		target.operation();
	}

}

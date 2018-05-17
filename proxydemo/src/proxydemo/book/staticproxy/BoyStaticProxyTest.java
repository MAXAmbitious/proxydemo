package proxydemo.book.staticproxy;

import proxydemo.book.facade.impl.BoyFacade;

/**
 * 静态代理测试类
 * @author 0200759
 *
 */
public class BoyStaticProxyTest {

	public static void main(String[] args) {  
		//创建目标对象
		BoyFacade boyFacade = new BoyFacade();
		//创建代理对象
		BoyStaticProxy bookStaticProxy = new BoyStaticProxy(boyFacade);
		//通过代理对象执行目标对象的方法
		bookStaticProxy.date();
	}
}

package proxydemo.book.dynamicproxy.cglib;

import proxydemo.book.facade.impl.BoyFacade;

/**
 * 男孩Cglib代理测试类
 * @author 0200759
 *
 */
public class BoyCglibProxyTest {

	public static void main(String[] args) {  
		//创建目标对象
		BoyFacade boyFacade = new BoyFacade();
		//创建代理对象
		BoyCglibProxy boyCglibProxy = new BoyCglibProxy();
		//生成代理实例
		BoyFacade boyCglibFacade = (BoyFacade) boyCglibProxy.getInstance(boyFacade);
		//执行目标对象的方法
		boyCglibFacade.date();
	}
}

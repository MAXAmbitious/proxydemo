package proxydemo.book.dynamicproxy.jdk;

import proxydemo.book.facade.IBoyFacade;
import proxydemo.book.facade.impl.BoyFacade;

/**
 * 男孩jdk代理测试类
 * @author 0200759
 *
 */
public class BoyJdkProxyTest {

	public static void main(String[] args) {
		//创建目标对象
		BoyFacade boyFacadeImpl = new BoyFacade();
		//创建代理对象
		BoyJdkProxy boyJdkProxy = new BoyJdkProxy();
		//代理对象绑定目标对象生成代理实例
		IBoyFacade boyFacade = (IBoyFacade) boyJdkProxy.bind(boyFacadeImpl);
		//执行目标方法
		boyFacade.date();
	}
}

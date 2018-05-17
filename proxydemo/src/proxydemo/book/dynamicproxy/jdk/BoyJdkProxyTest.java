package proxydemo.book.dynamicproxy.jdk;

import proxydemo.book.facade.IBoyFacade;
import proxydemo.book.facade.impl.BoyFacade;

/**
 * �к�jdk���������
 * @author 0200759
 *
 */
public class BoyJdkProxyTest {

	public static void main(String[] args) {
		//����Ŀ�����
		BoyFacade boyFacadeImpl = new BoyFacade();
		//�����������
		BoyJdkProxy boyJdkProxy = new BoyJdkProxy();
		//��������Ŀ��������ɴ���ʵ��
		IBoyFacade boyFacade = (IBoyFacade) boyJdkProxy.bind(boyFacadeImpl);
		//ִ��Ŀ�귽��
		boyFacade.date();
	}
}

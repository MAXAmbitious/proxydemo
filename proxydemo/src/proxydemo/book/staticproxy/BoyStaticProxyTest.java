package proxydemo.book.staticproxy;

import proxydemo.book.facade.impl.BoyFacade;

/**
 * ��̬���������
 * @author 0200759
 *
 */
public class BoyStaticProxyTest {

	public static void main(String[] args) {  
		//����Ŀ�����
		BoyFacade boyFacade = new BoyFacade();
		//�����������
		BoyStaticProxy bookStaticProxy = new BoyStaticProxy(boyFacade);
		//ͨ���������ִ��Ŀ�����ķ���
		bookStaticProxy.date();
	}
}

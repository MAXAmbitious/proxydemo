package proxydemo.book.dynamicproxy.cglib;

import proxydemo.book.facade.impl.BoyFacade;

/**
 * �к�Cglib���������
 * @author 0200759
 *
 */
public class BoyCglibProxyTest {

	public static void main(String[] args) {  
		//����Ŀ�����
		BoyFacade boyFacade = new BoyFacade();
		//�����������
		BoyCglibProxy boyCglibProxy = new BoyCglibProxy();
		//���ɴ���ʵ��
		BoyFacade boyCglibFacade = (BoyFacade) boyCglibProxy.getInstance(boyFacade);
		//ִ��Ŀ�����ķ���
		boyCglibFacade.date();
	}
}

package proxydemo.book.staticproxy;

import proxydemo.book.facade.IBoyFacade;
import proxydemo.book.facade.impl.BoyFacade;

public class BoyStaticProxy implements IBoyFacade{

	private BoyFacade bookFacade;
	
	/**
	 * ���캯��������bookFacade
	 * @param bookFacade
	 */
	public BoyStaticProxy(BoyFacade bookFacade){
		this.bookFacade = bookFacade;
	}

	@Override
	public void date() {
		//���ó�Ա����bookFacade�ķ���
		bookFacade.date();
		System.out.println("I'm dating a girl instead of you");
	}
}

package proxydemo.book.staticproxy;

import proxydemo.book.facade.IBoyFacade;
import proxydemo.book.facade.impl.BoyFacade;

public class BoyStaticProxy implements IBoyFacade{

	private BoyFacade bookFacade;
	
	/**
	 * 构造函数，定义bookFacade
	 * @param bookFacade
	 */
	public BoyStaticProxy(BoyFacade bookFacade){
		this.bookFacade = bookFacade;
	}

	@Override
	public void date() {
		//调用成员变量bookFacade的方法
		bookFacade.date();
		System.out.println("I'm dating a girl instead of you");
	}
}

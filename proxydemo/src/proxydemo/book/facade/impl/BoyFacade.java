package proxydemo.book.facade.impl;

import proxydemo.book.facade.IBoyFacade;

/**
 * ƒ–∫¢facade µœ÷¿‡
 * @author 0200759
 *
 */
public class BoyFacade implements IBoyFacade{

	@Override
	public void date() {
		System.out.println("I'm dating with a girl now!");
	}

}

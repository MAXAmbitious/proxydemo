package proxydemo.book.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * �к�jdk��̬������
 * @author 0200759
 *
 */
public class BoyJdkProxy implements InvocationHandler {

	 private Object target;//����ʵҵ��ʵ��������������þ����ҵ�񷽷� 
	    /** 
	     * ��ҵ����󲢷���һ��������  
	     */  
	    public Object bind(Object target) {  
	        this.target = target;  //����ҵ��ʵ����������

	       //ͨ��������ƣ�����һ�����������ʵ�������ء��û����з�������ʱʹ��
	       //�����������ʱ����Ҫ���ݸ�ҵ��������������������ȡҵ��ʵ�����Ԫ���ݣ��ڰ�װ�����ǵ���������ҵ�񷽷������ӿڡ�handlerʵ����
	        return Proxy.newProxyInstance(target.getClass().getClassLoader(),  
	                target.getClass().getInterfaces(), this); }  
	    /** 
	     * ��װ���÷���������Ԥ�������ú��� 
	     */  
	    public Object invoke(Object proxy, Method method, Object[] args)  
	            throws Throwable {  
	        Object result=null;  

	        System.out.println("Ԥ�������������������");  
	        //����������ҵ�񷽷�  
	        result=method.invoke(target, args);  

	        System.out.println("���ú�������������");  
	        return result;  
	    }  
}

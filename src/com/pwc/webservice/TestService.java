/**
 * 
 */
package com.pwc.webservice;

import java.awt.print.Printable;

/**
 * @author jyan062
 *
 */
public class TestService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	WSDLHelloWordProxy proxy = new WSDLHelloWordProxy();
	System.out.println(proxy.sayHi("yanjikun"));
} catch (Exception e) {
	// TODO: handle exception
}


	
	}

}

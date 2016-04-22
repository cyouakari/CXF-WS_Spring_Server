package org.fkjava.cxf.ws;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

	//
	public String sayHello(String name);
}
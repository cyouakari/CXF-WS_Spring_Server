package org.fkjava.cxf.ws.impl;

import java.util.Date;

import javax.jws.WebService;

import org.fkjava.cxf.ws.HelloWorld;

@WebService(endpointInterface="org.fkjava.cxf.ws.HelloWorld",serviceName="HelloWorldWs")
public class HelloWorldWs implements HelloWorld {

	@Override
	public String sayHello(String name) {
		return name+",您好！,现在时间是："+new Date();
	}

}

package org.springframework.demo.service.impl;

import org.springframework.demo.service.WelcomeService;

public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		return "name";
	}
}

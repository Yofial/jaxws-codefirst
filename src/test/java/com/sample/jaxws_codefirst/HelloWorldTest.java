package com.sample.jaxws_codefirst;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld helloWorld = new HelloWorld();
		String response = helloWorld.sayHi("world");
		assertEquals("Hello world", response);
	}

}
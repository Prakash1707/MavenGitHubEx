package com.lti.junitdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

public class JunitTestCases {

	@BeforeAll
	static void fun1() {
		System.out.println("@beforeAll");	
	}
	@BeforeEach
	void fun2() {
		System.out.println("@beforeEach");	
	}
	@AfterAll
	static void fun3() {
		System.out.println("@afterAll");	
	}
	@AfterEach
	 void fun4() {
		System.out.println("@afterEach");	
	}
	@Test
	void testShow() {
		MyApp m=new MyApp();
		String s=m.show();
		Assertions.assertEquals("hello maven", s,"failed");
	}
	@Test
	void testAdd() {
		int r=Calculator.add(100,200);
		Assertions.assertEquals(300,r);
		Assertions.assertNotEquals(100,r);
	}
}

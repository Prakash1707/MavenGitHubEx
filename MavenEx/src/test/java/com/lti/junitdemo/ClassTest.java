package com.lti.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Product;

public class ClassTest {

	@Test
	void testClass() {
		Product p=new Product(100,"Pen",1000);
		Assertions.assertEquals("DMART", p.getCompanyName());
	}
}

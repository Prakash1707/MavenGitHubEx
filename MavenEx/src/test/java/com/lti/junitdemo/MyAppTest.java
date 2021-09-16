package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class MyAppTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	void testShow() {
		MyApp m=new MyApp();
		String s=m.show();
		Assertions.assertEquals("hello maven", s,"failed");
	}
	@Test
	void testShow2() {
		MyApp m=new MyApp();
		String s=m.show();
		Assertions.assertEquals("hello maven", s,"failed");
	}
	@Test
	void testShow3() {
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
	@Test
	void testAssertFalse(){
		Assertions.assertFalse("Prakash".length()==10);
		Assertions.assertFalse(20<10,"Comparing");
	}
	@Test
	void testAssertNull() {
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
//	@Test
//	void testAssertAll() {
//		String s1="aaa";
//		String s2="bbb";
//		String s3="ccc";
//		Assertions.assertAll("data",
//				()->Assertions.assertEquals(s1,"aaa"),
//				()->Assertions.assertEquals(s2, "bbb"),
//				()->Assertions.assertEquals(s3,"ccc")
//				);
//	}
//	@Test
//	void testCollections() {
//		ArrayList<String> mylist=new ArrayList<>();
//		mylist.add("Hello");
//		Assertions.assertFalse(mylist.isEmpty());
//	}

}

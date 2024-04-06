package com.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.nit.service.App;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.class)
public class Test2 {

	private static App app;
	@BeforeAll
	public static void setUp() {
		 app=new App();
	}

	@Test
	@Order(2)
	//@DisplayName("")
	public void testWithPositiveOnAdd() {
		int i=10;
		int j=20;
		int add=i+j;
		assertEquals(App.add(i, j),add);
		
	}
	@Test
	//@DisplayName("")
	@Order(5)
	public void testWithPositiveOnSub() {
		int i=10;
		int j=20;
		int sub=i-j;
		assertEquals(sub,app.sub(i, j));
	}
	@Test
	//@DisplayName("")
	@Order(8)
	public void testWithPositiveOnMul() {
		int i=10;
		int j=20;
		int mul=i*j;
		assertEquals(mul,app.mul(i, j));
	}
	@AfterAll
	public static void tearDown() {
		app=null;
	}
}

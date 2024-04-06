package com.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.nit.service.App;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.class)
public class Test2 {

	@Spy
	private static App app;
	Test2(){
		MockitoAnnotations.openMocks(this);
	}

	@Test
	@Order(2)
	//@DisplayName("")
	//@Disabled

	//@Tag("Uat")
	public void testWithPositiveOnAdd() {
		int i=10;
		int j=20;
		int add=i+j;
		assertEquals(App.add(i, j),add);
		
	}
	@Test
	//@DisplayName("")
	//@Tag("Dev")
	@Order(5)
	public void testWithPositiveOnSub() {
		int i=10;
		int j=20;
		int sub=i-j;
		assertEquals(sub,App.sub(i, j));
	}
	@Test
	//@DisplayName("")
	@Order(8)
	//@Tag("test")
	public void testWithPositiveOnMul() {
		int i=10;
		int j=20;
		int mul=Math.multiplyExact(i, j);
		System.out.println(app.mul(i, j));
		assertEquals(mul,app.mul(i, j));
		}
	
}

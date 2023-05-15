package org.combine;

import org.testng.annotations.Test;

public class TestNg1 {
	@Test 
	public void testCase01() {
		System.out.println("TC..1"+Thread.currentThread().getId());
	}

	@Test 
	public void testCase02() {
		System.out.println("TC..2"+Thread.currentThread().getId());
	}

	@Test 
	public void testCase03() {
		System.out.println("TC..3"+Thread.currentThread().getId());
	}




}




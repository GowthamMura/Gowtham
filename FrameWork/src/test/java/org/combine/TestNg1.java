package org.combine;

import org.testng.annotations.Test;

public class TestNg1 {
	@Test 
	public void tc1() {
		System.out.println("TC..1"+Thread.currentThread().getId());
	}

	@Test 
	public void tc2() {
		System.out.println("TC..2"+Thread.currentThread().getId());
	}

	@Test 
	public void tc3() {
		System.out.println("TC..3"+Thread.currentThread().getId());
	}




}




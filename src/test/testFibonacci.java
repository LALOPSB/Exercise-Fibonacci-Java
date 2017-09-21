package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Fibonacci;


public class testFibonacci {
	
	@Test
	public void test_trying_position_0_returns_0(){
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(0, fibonacci.returnFibonacci(0));
	}
	
	@Test
	public void test_trying_position_1_returns_1(){
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(0, fibonacci.returnFibonacci(0));
	}

	@Test
	public void test_entering_position_over_1_returns_the_sum_of_the_two_previuos_numbers(){
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(55, fibonacci.returnFibonacci(10));
	}
}

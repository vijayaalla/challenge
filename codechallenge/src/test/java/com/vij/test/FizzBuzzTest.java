package com.vij.test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void checkDivisibleByThreeAndFiveReplacedByWordFizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> lstResult = fizzBuzz.fizzBuzzForGivenRange(1, 20);
		//lstResult.forEach(System.out::println);
		assertEquals("FizzBuzz", lstResult.get(14));
		
	}
				 
	@Test
	public void checkDivisibleByThreeReplacedByWordFizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> lstResult = fizzBuzz.fizzBuzzForGivenRange(1, 20);
		
		assertEquals("Fizz", lstResult.get(2));
		assertEquals("Fizz", lstResult.get(5));
		assertEquals("Fizz", lstResult.get(8));
		assertEquals("Fizz", lstResult.get(11));
		assertEquals("Fizz", lstResult.get(17));
		
	}
	
	
	@Test
	public void checkDivisibleByFiveReplacedByWordBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> lstResult = fizzBuzz.fizzBuzzForGivenRange(1, 20);
		assertEquals("Buzz", lstResult.get(4));
		assertEquals("Buzz", lstResult.get(9));
		assertEquals("Buzz", lstResult.get(19));
	}
				 
	
	
	
}

package com.vij.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

	public List<String> fizzBuzzForGivenRange(int start, int end) {
		
		return IntStream.iterate(start, n -> n + 1)
				 .limit(end)
				 .boxed()
				 .map(x -> (isDivisibleByFifteen(x) ? "FizzBuzz" : (isDivisibleByThree(x) ? "Fizz": (isDivisibleByFive(x)? "Buzz": x + ""))))
		         .collect(Collectors.toList());
					 
	}
	
	private boolean isDivisibleByFifteen(int number) {
		return number % 15 == 0;
	}
	
	private boolean isDivisibleByThree(int number) {
		return number % 3 == 0;
	}
	
	private boolean isDivisibleByFive(int number) {
		return number % 5 == 0;
	}

}

package com.vij.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ReplaceWordTest {
	
	@Test
	public void replaceWordThreeWithHomeOffice() {
		ReplaceWord rw = new ReplaceWord();
		List<String> lstValues = Arrays.asList("1", "2", "3", "4", "Buzz");
		List<String> lstResults = rw.replaceThreeWithHomeOffice(lstValues);
		assertEquals("homeoffice", lstResults.get(2));
		assertNotEquals("homeoffice", lstResults.get(0));
		assertNotEquals("homeoffice", lstResults.get(1));
		assertNotEquals("homeoffice", lstResults.get(3));
		assertNotEquals("homeoffice", lstResults.get(4));

	}

	@Test
	public void replaceWordThreeWithHomeOfficeMultipleTimes() {
		ReplaceWord rw = new ReplaceWord();
		List<String> lstValues = Arrays.asList("1", "2", "3", "4", "Buzz", "3");
		List<String> lstResults = rw.replaceThreeWithHomeOffice(lstValues);
		assertEquals("homeoffice", lstResults.get(2));
		assertEquals("homeoffice", lstResults.get(5));
		
		assertNotEquals("homeoffice", lstResults.get(0));
		assertNotEquals("homeoffice", lstResults.get(1));
		assertNotEquals("homeoffice", lstResults.get(3));
		assertNotEquals("homeoffice", lstResults.get(4));

	}

	@Test
	public void replaceWordThreeWithHomeOfficeWithOneElementNull() {
		ReplaceWord rw = new ReplaceWord();
		List<String> lstValues = Arrays.asList("1", "2", "3", null, "Buzz", "3");
		List<String> lstResults = rw.replaceThreeWithHomeOffice(lstValues);
		assertEquals("homeoffice", lstResults.get(2));
		assertEquals("homeoffice", lstResults.get(5));
		
		assertNotEquals("homeoffice", lstResults.get(0));
		assertNotEquals("homeoffice", lstResults.get(1));
		assertNotEquals("homeoffice", lstResults.get(3));
		assertNotEquals("homeoffice", lstResults.get(4));

	}

	
	@Test
	public void replaceWordThreeWithHomeOfficeWithNullInput() {
		ReplaceWord rw = new ReplaceWord();
		List<String> lstResults = rw.replaceThreeWithHomeOffice(null);
		assertNull(lstResults);

	}

	@Test
	public void replaceWordThreeWithHomeOfficeWithEmptyInput() {
		ReplaceWord rw = new ReplaceWord();
		List<String> lstResults = rw.replaceThreeWithHomeOffice(Collections.EMPTY_LIST);
		assertTrue(lstResults.isEmpty());
	}
}

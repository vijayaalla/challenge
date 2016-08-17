package com.vij.test;

import java.util.List;
import java.util.stream.Collectors;

public class ReplaceWord {

	public List<String> replaceThreeWithHomeOffice(List<String> lstValues) {
		if(lstValues == null) return null;
		return lstValues.stream()
				 .map(e -> e.equals("3") ? "homeoffice" : e)
				 .collect(Collectors.toList());
	}

}

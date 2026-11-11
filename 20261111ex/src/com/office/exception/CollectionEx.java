package com.office.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class CollectionEx {
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList : 배열을 업그레이드
		 */
		
		List<Integer> nums = new Vector<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		nums.remove(4);
		nums.remove(3);
		
		nums.clear();
		
		// String -> StringBuffer -> StringBuilder
		// Array  -> Vector		  -> ArrayList
		
		Map<String, String> hashMap = new HashMap<String, String>();
		
		
	}
	
}

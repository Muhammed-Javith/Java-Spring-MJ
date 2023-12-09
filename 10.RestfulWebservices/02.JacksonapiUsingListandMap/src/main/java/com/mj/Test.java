package com.mj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(55);
		List<Integer> lst = Arrays.asList(10, 20, 30);
		emp.setEmpPrjs(lst);
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "A");
		map.put(20, "B");
		map.put(30, "C");
		emp.setEmpMap(map);
		try {
			ObjectMapper om = new ObjectMapper();
			String json = om.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
			System.out.println(json);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
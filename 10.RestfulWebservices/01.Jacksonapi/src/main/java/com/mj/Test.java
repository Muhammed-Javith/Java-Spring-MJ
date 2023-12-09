package com.mj;

import com.fasterxml.jackson.databind.ObjectMapper;

//java object converetd to json
public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("A");
		emp.setEmpSal(2.3);
		emp.setEmpPwd("ABC");
		try {
			// Convert object to JSON string
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(emp);
			System.out.println("\nOutput printed in single line.");
			System.out.println("==============================\n");
			System.out.println(json);
			// Convert object to JSON string and pretty print
			System.out.println("\nOutput printed as pretty print format:");
			System.out.println("=======================================\n");
			json = om.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
			System.out.println(json);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
package com.app.mj.factory;

import com.app.mj.service.StudentService;
import com.app.mj.service.impl.StudentServiceImpl;

public class StudentServiceFactory {
	private static StudentService service;
	static {
		service = new StudentServiceImpl();
	}

	public static StudentService getStudentService() {
		return service;
	}
}
package com.app.mj.factory;

import com.app.mj.dao.StudentDao;
import com.app.mj.dao.impl.StudentDaoImpl;

public class StudentDaoFactory {
	private static StudentDao dao;
	static {
		dao = new StudentDaoImpl();
	}

	public static StudentDao getStudentDao() {
		return dao;
	}
}

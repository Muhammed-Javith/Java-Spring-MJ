package com.app.mj.service.impl;

import com.app.mj.dao.StudentDao;
import com.app.mj.dto.StudentDto;
import com.app.mj.factory.StudentDaoFactory;
import com.app.mj.service.StudentService;

public class StudentServiceImpl implements StudentService {
	String status = "";

	@Override
	public String addStudent(StudentDto sto) {
		StudentDao dao = StudentDaoFactory.getStudentDao();
		status = dao.add(sto);
		return status;
	}

	@Override
	public StudentDto searchStudent(String sid) {
		StudentDto sto = null;
		StudentDao dao = StudentDaoFactory.getStudentDao();
		sto = dao.search(sid);
		return sto;
	}

	@Override
	public String deleteStudent(String sid) {
		StudentDao dao = StudentDaoFactory.getStudentDao();
		status = dao.delete(sid);
		return status;
	}
}
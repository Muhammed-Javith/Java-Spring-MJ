package com.app.mj.service;

import com.app.mj.dto.StudentDto;

public interface StudentService {
	public String addStudent(StudentDto sto);

	public StudentDto searchStudent(String sid);

	public String deleteStudent(String sid);
}
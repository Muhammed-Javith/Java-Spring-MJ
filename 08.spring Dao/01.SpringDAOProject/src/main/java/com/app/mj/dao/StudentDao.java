package com.app.mj.dao;

import com.app.mj.dto.StudentDto;

public interface StudentDao {
	public String add(StudentDto sto);

	public StudentDto search(String sid);

	public String delete(String sid);
}

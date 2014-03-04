package com.beans.leaveapp.employeeGrade.service;

import java.util.List;

import com.beans.leaveapp.employeeGrade.model.EmployeeGrade;

public interface EmployeeGradeService {
	public EmployeeGrade create(EmployeeGrade employeeGrade) throws EmployeeGradeNotFound;
	public EmployeeGrade deleted(int id) throws Exception;
	public List<EmployeeGrade> findAll() throws  Throwable;
	public EmployeeGrade update(EmployeeGrade employeeGrade) throws EmployeeGradeNotFound;
	public EmployeeGrade findById(int id) throws EmployeeGradeNotFound;
	// public List<EmployeeGrade> findAll();

}

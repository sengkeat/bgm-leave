package com.beans.leaveapp.employeeGrade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.beans.leaveapp.employeeGrade.model.EmployeeGrade;


public interface EmployeeGradeRepository extends CrudRepository<EmployeeGrade, Integer> {

	 @Query("select e from EmployeeGrade e where isDeleted = ?")
	 List<EmployeeGrade> findByisDeleted(int x);
	
	@Query("select e from EmployeeGrade e")
	 List<EmployeeGrade> findAllIncludingDeleted();

	
	
	

}

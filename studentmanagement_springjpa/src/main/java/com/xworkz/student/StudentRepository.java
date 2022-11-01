package com.xworkz.student;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
public interface StudentRepository 
//extends CrudRepository<Student, Long>
{

	@Query(value = "SELECT s FROM Student s WHERE s.name LIKE '%' || :keyword || '%'"
	+ " OR s.email LIKE '%' || :keyword || '%'"
	+ " OR s.address LIKE '%' || :keyword || '%'")
	public List<Student> search(@Param("keyword") String keyword);
	
	boolean save(Student student);
	
	List<Student> listAll();

}

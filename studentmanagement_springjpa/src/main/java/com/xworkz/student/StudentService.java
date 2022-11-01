package com.xworkz.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {
	
	
	
	public StudentService() {
		System.out.println("-------inside service----------");
	}

	@Autowired 
	StudentRepository repo;
	
	public void save(Student student) {
		repo.save(student);
	}
	public List<Student> listAll(){
		System.out.println("--listAll----------");
		return repo.listAll();
	}
//	public Student get(Long id) {
//		return repo.findById(id).get();
//	}
//	public void delete(Long id) {
//		repo.deleteById(id);
//	}
//	
	public List<Student> search(String keyword) {
		return repo.search(keyword);
	}
}

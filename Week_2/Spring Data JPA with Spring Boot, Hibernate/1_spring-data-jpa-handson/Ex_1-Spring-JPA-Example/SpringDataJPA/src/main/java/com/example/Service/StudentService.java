package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.Entity.Student;
import com.example.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void save(Student s) {
		studentRepository.save(s);
	}
	
	public Student findById(int id) {
		return studentRepository.findById(id).get();
	}
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
}

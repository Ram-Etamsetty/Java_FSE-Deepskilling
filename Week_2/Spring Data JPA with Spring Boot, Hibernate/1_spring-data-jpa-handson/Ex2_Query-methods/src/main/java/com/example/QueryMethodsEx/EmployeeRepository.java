package com.example.QueryMethodsEx;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	List<Employee> findByNameContaining(String text);
	
	List<Employee> findAllByOrderByNameAsc();
	
	List<Employee> findByNameStartingWith(String ch);
	
	List<Employee> findByDateBetween(LocalDate startDate,LocalDate endDate);
	
	Employee findTopByOrderByNameDesc();
	
}

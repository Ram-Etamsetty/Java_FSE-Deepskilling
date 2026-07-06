package com.example.QueryMethodsEx;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> saveAll(List<Employee> employees) {
        return repository.saveAll(employees);
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public List<Employee> searchByName(String text) {
        return repository.findByNameContaining(text);
    }

    public List<Employee> sortByName() {
        return repository.findAllByOrderByNameAsc();
    }

    public List<Employee> searchByStartingText(String ch) {
        return repository.findByNameStartingWith(ch);
    }

    public List<Employee> searchBetweenDates(LocalDate startDate,LocalDate endDate) {
        return repository.findByDateBetween(startDate, endDate);
    }

    public Employee getTopEmployee() {
        return repository.findTopByOrderByNameDesc();
    }
}

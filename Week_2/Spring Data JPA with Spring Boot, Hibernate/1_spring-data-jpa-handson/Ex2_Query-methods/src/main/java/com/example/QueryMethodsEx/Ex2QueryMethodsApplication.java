package com.example.QueryMethodsEx;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ex2QueryMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Ex2QueryMethodsApplication.class, args);

		EmployeeService service = context.getBean(EmployeeService.class);

		service.save(new Employee("Ram", "CSE", LocalDate.of(2023, 1, 10)));
		service.save(new Employee("Rahul", "ECE", LocalDate.of(2022, 5, 15)));
		service.save(new Employee("Hemanth", "IT", LocalDate.of(2024, 3, 20)));
		service.save(new Employee("Sai", "CSE", LocalDate.of(2021, 12, 25)));

		System.out.println("All Employees");
		System.out.println(service.findAll());

		System.out.println("Containing 'am'");
		System.out.println(service.searchByName("am"));

		System.out.println("Starting With 'Ra'");
		System.out.println(service.searchByStartingText("Ra"));

		System.out.println("Sorted By Name");
		System.out.println(service.sortByName());

		System.out.println("Between Dates");
		System.out.println(service.searchBetweenDates(LocalDate.of(2022, 1, 1),LocalDate.of(2023, 12, 31)));

		System.out.println("Top Employee");
		System.out.println(service.getTopEmployee());
	}

}

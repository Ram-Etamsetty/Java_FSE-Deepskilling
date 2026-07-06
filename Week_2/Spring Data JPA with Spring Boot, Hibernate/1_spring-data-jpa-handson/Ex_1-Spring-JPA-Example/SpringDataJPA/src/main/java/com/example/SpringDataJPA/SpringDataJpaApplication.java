package com.example.SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.Entity.Student;
import com.example.Service.StudentService;


@SpringBootApplication
@EnableJpaRepositories("com.example.Repository")
@EntityScan("com.example.Entity")
@ComponentScan("com.example")
public class SpringDataJpaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringDataJpaApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

	    StudentService studentService =
	            context.getBean(StudentService.class);
		Student s = new Student("Ram","CSE");
		Student s2 = new Student("Sai","CSC");
		studentService.save(s);
		studentService.save(s2);
		System.out.println(studentService.findAll());
	}
}

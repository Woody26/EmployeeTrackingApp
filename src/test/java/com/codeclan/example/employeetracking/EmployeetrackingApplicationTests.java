package com.codeclan.example.employeetracking;

import com.codeclan.example.employeetracking.models.Employee;
import com.codeclan.example.employeetracking.repositries.EmployeeRepositry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackingApplicationTests {

	@Autowired
	EmployeeRepositry employeeRepositry;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee steve = new Employee("Steve", "Jobs", 50, 1, "stevejobs@apple.com");
		employeeRepositry.save(steve);
		Employee steve2 = new Employee("Steve", "Wozniak", 69, 1, "stevewozniak@apple.com");
		employeeRepositry.save(steve2);
	}



}

package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Employee;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public abstract ArrayList<Employee> findByName(Integer name);

}

package co.edu.utadeo.service;

import co.edu.utadeo.domain.Employee;
import co.edu.utadeo.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService extends EntityService<Employee> {

	@Autowired
	private EmployeeRepository employeeRepository;
	EmployeeService(EmployeeRepository repository) {
        super(repository);
    }


	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	
  /*  public ArrayList<Employee> getEmployee() {
		return (ArrayList<Employee>) employeeRepository.findAll();
	}*/
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	public void getForId(int id) {
	 employeeRepository.findById(id);
	}
	
	public ArrayList<Employee> getForName(int name) {
		return employeeRepository.findByName(name);
	}


	
}

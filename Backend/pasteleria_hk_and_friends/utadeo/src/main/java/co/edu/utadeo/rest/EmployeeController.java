package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Applicant;
import co.edu.utadeo.domain.Employee;
import co.edu.utadeo.service.ApplicantService;
import co.edu.utadeo.service.EmployeeService;
import co.edu.utadeo.service.EntityService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/employees")
public class EmployeeController extends EntityController<Employee>{

	@Autowired
	private EmployeeService employeeService;
    EmployeeController(EmployeeService service) {
        super(service);
    }
    
    @RequestMapping("/employee1")
    public String ver() {
    	return "hkpasteleria";
    }
    
    @GetMapping("/employee")
    @ResponseBody
   	public ArrayList<Employee> getEmployee() {
   	   return (ArrayList<Employee>) employeeService.getEmployees();
   	}
    
    @GetMapping("/employee/{id}")
    public Employee getEmployeeOne(@PathVariable(value="id") int id) {
		return employeeService.getOne(id);    	
    }
    
    @PostMapping("/employee")
    public Employee save (@RequestBody Employee employee ){
        return service.save(employee);
    }

    @DeleteMapping("/employee/delete/{id}")
    public String deleteEmployee(Model model, @PathVariable int id) {
    	employeeService.delete(id);
    	return "redirect:/employee";
    }
    
    @PutMapping("/employee")
    public Employee putEmployee(@RequestBody Employee employee) {
    	return employeeService.save(employee);
    }
   
}

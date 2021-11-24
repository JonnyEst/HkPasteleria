package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Company;
import co.edu.utadeo.service.CompanyService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/companies")
public class CompanyController extends EntityController<Company>{

	@Autowired
	CompanyService companyService;
    CompanyController(CompanyService service) {
        super(service);
    }
    
    @GetMapping("/companie")
 	public ArrayList<Company> getCompany() {
 	   return companyService.getCompany();
 	}
    
    @GetMapping("/companie/{id}")
    public Company getCompanyOne(@PathVariable(value="id") int id) {
		return companyService.getOne(id);    	
    }
    
    @PostMapping("/companie")
    public Company save (@RequestBody Company company ){
        return service.save(company);
    }

    @DeleteMapping("/companie/delete/{id}")
    public String deleteCompany(Model model, @PathVariable int id) {
    	companyService.delete(id);
    	return "redirect:/companie";
    }
    
    @PutMapping("/companie")
    public Company putCompany(@RequestBody Company company) {
    	return companyService.save(company);
    }
}

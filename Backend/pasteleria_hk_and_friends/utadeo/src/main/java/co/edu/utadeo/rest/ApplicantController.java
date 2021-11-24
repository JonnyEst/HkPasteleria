package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Applicant;
import co.edu.utadeo.service.ApplicantService;

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
@RequestMapping("/api/applicants")
public class ApplicantController extends EntityController<Applicant> {

	@Autowired
	ApplicantService applicantService;
    ApplicantController(ApplicantService service) {
        super(service);
    }
    
    @GetMapping("/applicant")
   	public ArrayList<Applicant> getApplicant() {
   	   return applicantService.getApplicant();
   	}
    
    @GetMapping("/applicant/{id}")
    public Applicant getCountryOne(@PathVariable(value="id") int id) {
		return applicantService.getOne(id);    	
    }
    
    @PostMapping("/applicant")
    public Applicant save(@RequestBody Applicant applicant ){
        return service.save(applicant);
    }

    @DeleteMapping("/applicant/delete/{id}")
    public String deleteApplicant(Model model, @PathVariable int id) {
    	applicantService.delete(id);
    	return "redirect:/applicant";
    }
    
    @PutMapping("/applicant")
    public Applicant putApplicant(@RequestBody Applicant applicant) {
    	return applicantService.save(applicant);
    }
}

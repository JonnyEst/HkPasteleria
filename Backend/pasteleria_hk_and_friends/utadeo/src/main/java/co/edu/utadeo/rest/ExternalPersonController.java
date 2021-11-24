package co.edu.utadeo.rest;

import co.edu.utadeo.domain.ExternalPerson;
import co.edu.utadeo.service.ExternalPersonService;

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
@RequestMapping("/api/external-people")
public class ExternalPersonController extends EntityController<ExternalPerson>{


	@Autowired
	ExternalPersonService externalPersonService;
	ExternalPersonController(ExternalPersonService service) {
        super(service);
    }
	
	 @GetMapping("/external-people")
	   	public ArrayList<ExternalPerson> getExternalPerson() {
	   	   return externalPersonService.getExternalPerson();
	   	}
	    
	    @GetMapping("/external-people/{id}")
	    public ExternalPerson getCountryOne(@PathVariable(value="id") int id) {
			return externalPersonService.getOne(id);    	
	    }
	    
	    @PostMapping("/external-people")
	    public ExternalPerson save (@RequestBody ExternalPerson externalPerson ){
	        return service.save(externalPerson);
	    }

	    @DeleteMapping("/external-people/delete/{id}")
	    public String deleteExternalPerson(Model model, @PathVariable int id) {
	    	externalPersonService.delete(id);
	    	return "redirect:/external-people";
	    }
	    
	    @PutMapping("/external-people")
	    public ExternalPerson putExternalPerson(@RequestBody ExternalPerson externalPerson) {
	    	return externalPersonService.save(externalPerson);
	    }
	    
}

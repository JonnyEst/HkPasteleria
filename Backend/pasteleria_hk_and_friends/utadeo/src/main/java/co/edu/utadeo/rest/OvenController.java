package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Country;
import co.edu.utadeo.domain.Oven;
import co.edu.utadeo.service.CountryService;
import co.edu.utadeo.service.OvenService;

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
@RequestMapping("/api/ovens")
public class OvenController extends EntityController<Oven>{

	@Autowired
	OvenService ovenService;
    OvenController(OvenService service) {
        super(service);
    }
    
    
    @GetMapping("/oven")
   	public ArrayList<Oven> getOven() {
   	   return ovenService.getOven();
   	}
    
    @GetMapping("/oven/{id}")
    public Oven getCountryOne(@PathVariable(value="id") int id) {
		return ovenService.getOne(id);    	
    }
    
    @PostMapping("/oven")
    public Oven save (@RequestBody Oven oven ){
        return service.save(oven);
    }

    @DeleteMapping("/oven/delete/{id}")
    public String deleteOven(Model model, @PathVariable int id) {
    	ovenService.delete(id);
    	return "redirect:/oven";
    }
    
    @PutMapping("/oven")
    public Oven putOven(@RequestBody Oven oven) {
    	return ovenService.save(oven);
    }
   
}

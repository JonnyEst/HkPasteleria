package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Cake;
import co.edu.utadeo.domain.Country;
import co.edu.utadeo.domain.Employee;
import co.edu.utadeo.service.CakeService;

import java.util.ArrayList;

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
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/cakes")
public class CakeController extends EntityController<Cake>{

	@Autowired
	CakeService cakeService;
    CakeController(CakeService service) {
        super(service);
    }
    
    @GetMapping("/cake")
 	public ArrayList<Cake> getCake() {
 	   return cakeService.getCake();
 	}

    @GetMapping("/cake/{id}")
    public Cake getCakeOne(@PathVariable(value="id") int id) {
		return cakeService.getOne(id);    	
    }

    @PostMapping("/cake")
    public Cake save (@RequestBody Cake cake ){
        return service.save(cake);
    }   

    @DeleteMapping("/cake/delete/{id}")
    public String deletecake(Model model, @PathVariable int id) {
    	cakeService.delete(id);
    	return "redirect:/cake";
    }
    
    @PutMapping("/cake")
    public Cake putEmployee(@RequestBody Cake cake) {
    	return cakeService.save(cake);
    }
    
    
    
    
    
        
    
    
}

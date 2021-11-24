package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Country;
import co.edu.utadeo.domain.Decorator;
import co.edu.utadeo.service.DecoratorService;

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
@RequestMapping("/api/decorators")
public class DecoratorController extends EntityController<Decorator>{

	@Autowired
	DecoratorService decoratorService;
    DecoratorController(DecoratorService service) {
        super(service);
    }
    
    @GetMapping("/decorator")
	public ArrayList<Decorator> getDecorator() {
	   return decoratorService.getDecorator();
	}
    
    @PostMapping("/decorator")
    public Decorator save (@RequestBody Decorator decorator ){
        return service.save(decorator);
    }

    @DeleteMapping("/decorator/delete/{id}")
    public String deleteDecorator(Model model, @PathVariable int id) {
    	decoratorService.delete(id);
    	return "redirect:/decorator";
    }
    
    @PutMapping("/decorator")
    public Decorator putCountry(@RequestBody Decorator decorator) {
    	return decoratorService.save(decorator);
    }
   
}

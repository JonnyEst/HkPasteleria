package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Bake;
import co.edu.utadeo.domain.Country;
import co.edu.utadeo.service.BakeService;

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
@RequestMapping("/api/bakes")
public class BakeController extends EntityController<Bake>{

	@Autowired
	BakeService bakeService;
    BakeController(BakeService service) {
        super(service);
    }
    
    @GetMapping("/bake")
   	public ArrayList<Bake> getBak() {
   	   return bakeService.getBake();
   	}
    
    @PostMapping("/bake")
    public Bake save (@RequestBody Bake bake ){
        return service.save(bake);
    }
    
    @DeleteMapping("/bake/delete/{id}")
    public String deleteBake(Model model, @PathVariable int id) {
    	bakeService.delete(id);
    	return "redirect:/bake";
    }
    
    @PutMapping("/bake")
    public Bake putCountry(@RequestBody Bake bake) {
    	return bakeService.save(bake);
    }
   
    
    
}

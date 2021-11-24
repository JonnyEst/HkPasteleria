package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Decor;
import co.edu.utadeo.service.DecorService;

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
@RequestMapping("/api/decors")
public class DecorController extends EntityController<Decor>{

	@Autowired
	DecorService decorService;
    DecorController(DecorService service) {
        super(service);
    }
    
   @GetMapping("/decor")
   	public ArrayList<Decor> getDecor() {
   	   return decorService.getDecor();
   	}
   
   @PostMapping("/decor")
   public Decor save (@RequestBody Decor decor ){
       return service.save(decor);
   }

   @DeleteMapping("/decor/delete/{id}")
   public String deleteDecor(Model model, @PathVariable int id) {
	   decorService.delete(id);
   	return "redirect:/decor";
   }
   
   @PutMapping("/decor")
   public Decor putDecor(@RequestBody Decor decor) {
   	return decorService.save(decor);
   }
  
    
}

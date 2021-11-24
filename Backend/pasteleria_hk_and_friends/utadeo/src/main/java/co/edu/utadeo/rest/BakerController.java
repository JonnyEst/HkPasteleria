package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Baker;
import co.edu.utadeo.domain.Country;
import co.edu.utadeo.service.BakerService;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bakers")
public class BakerController extends EntityController<Baker>{
	
	@Autowired
	BakerService bakerService;
    BakerController(BakerService service) {
        super(service);
    }
	

  /*  @GetMapping("/baker")
    public String baker() {
    	return "Hola soy baker";
    }*/
     @GetMapping("/baker")
	public ArrayList<Baker> getPastryChef() {
	   return bakerService.getPastryChef();
	}
     
     @GetMapping("/baker/{id}")
     public Baker getCountryOne(@PathVariable(value="id") int id) {
 		return bakerService.getOne(id);    	
     }
	
     @PostMapping("/baker")
     public Baker save (@RequestBody Baker baker ){
         return service.save(baker);
     }
     
  /*   @DeleteMapping("/baker/delete/{id}")
     public String deleteBaker(Model model, @PathVariable int id) {
     	bakerService.delete(id);
     	return "redirect:/baker";
     }
     
     @PutMapping("/baker")
     public Baker putBaker(@RequestBody Baker baker) {
     	return bakerService.save(baker);
     }
    
  /* @PostMapping("/baker")
   public Baker save (@RequestBody Baker baker ){
       return service.save(baker);
   }
   
   
   // , consumes="application/json", produces="application/json"
/*	@PostMapping(value="/bakerpost")
	public String savePastryChef(@RequestBody Baker baker) {
		return baker.toString();
		//return this.bakerService.savePastryChef(baker) ;
	}
	
	
	/*	@GetMapping( path = "/{id}")
	public Optional<Baker> getForId(@PathVariable("id") Integer id) {
		return this.bakerService.getForId(id);
	}
	
	@GetMapping("/query")
	public ArrayList<Baker> getForName(@RequestParam("name") Integer name) {
		return this.bakerService.getForName(name);
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteBaker(@PathVariable("id") Integer id) {
		boolean ok = this.bakerService.deleteBaker(id);
		
		if(ok) {
			return "Se elimino el usuario con id:" + id;
		}else {
			return "No se ha encontrado el usuario con id: "+ id;
		}
	}*/
}

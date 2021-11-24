package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Ingredient;
import co.edu.utadeo.service.IngredientService;

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
@RequestMapping("/api/ingredients")
public class IngredientController extends EntityController<Ingredient>{

	@Autowired
	IngredientService ingredientService;
	IngredientController(IngredientService service) {
        super(service);
    }
	
	@GetMapping("/ingredient")
   	public ArrayList<Ingredient> getIngredient() {
   	   return ingredientService.getIngredient();
   	}
    
    @GetMapping("/ingredient/{id}")
    public Ingredient getCountryOne(@PathVariable(value="id") int id) {
		return ingredientService.getOne(id);    	
    }
    
    @PostMapping("/ingredient")
    public Ingredient save (@RequestBody Ingredient ingredient ){
        return service.save(ingredient);
    }

    @DeleteMapping("/ingredient/delete/{id}")
    public String deleteIngredient(Model model, @PathVariable int id) {
    	ingredientService.delete(id);
    	return "redirect:/ingredient";
    }
    
    @PutMapping("/ingredient")
    public Ingredient putIngredient(@RequestBody Ingredient ingredient) {
    	return ingredientService.save(ingredient);
    }
   
}

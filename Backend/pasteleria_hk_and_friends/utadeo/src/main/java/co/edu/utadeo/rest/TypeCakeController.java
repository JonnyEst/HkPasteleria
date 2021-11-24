package co.edu.utadeo.rest;

import co.edu.utadeo.domain.TypeCake;
import co.edu.utadeo.service.TypeCakeService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/types-cakes")
public class TypeCakeController extends EntityController<TypeCake>{

	@Autowired
	TypeCakeService typeCakeService;
	TypeCakeController(TypeCakeService service) {
        super(service);
    }

    @PutMapping("/{id}")
    public TypeCake updateTypeCake(@PathVariable Integer id, @RequestBody TypeCake typeCake) throws Exception {
        TypeCake result = service.getOne(id);
        if(result == null){
            throw new Exception("Entity with id "+id+" not exists");
        }
        result.setName(typeCake.getName());
        return service.save(result);
    }
    
    @GetMapping("/type-cake")
   	public ArrayList<TypeCake> getTypeCake() {
   	   return typeCakeService.getTypeCake();
   	}
    
    @GetMapping("/type-cake/{id}")
    public TypeCake getTypeCakeOne(@PathVariable(value="id") int id) {
		return typeCakeService.getOne(id);    	
    }
    
    @PostMapping("/type-cake")
    public TypeCake save (@RequestBody TypeCake typeCake ){
        return service.save(typeCake);
    }

    @DeleteMapping("/type-cake/delete/{id}")
    public String deleteTypeCake(Model model, @PathVariable int id) {
    	typeCakeService.delete(id);
    	return "redirect:/country";
    }
    
    @PutMapping("/type-cake")
    public TypeCake putTypeCake(@RequestBody TypeCake typeCake) {
    	return typeCakeService.save(typeCake);
    }
   
    
    
    

}

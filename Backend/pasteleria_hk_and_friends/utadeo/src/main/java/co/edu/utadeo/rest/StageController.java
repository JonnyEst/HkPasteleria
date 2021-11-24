package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Country;
import co.edu.utadeo.domain.Stage;
import co.edu.utadeo.service.CountryService;
import co.edu.utadeo.service.StageService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stages")
public class StageController extends EntityController<Stage>{

	@Autowired
	StageService stageService;
    StageController(StageService service) {
        super(service);
    }
    
    @GetMapping("/stage")
   	public ArrayList<Stage> getStage() {
   	   return stageService.getStage();
   	}
    
    @GetMapping("/stage/{id}")
    public StageService getStageOne(@PathVariable(value="id") int id) {
		return stageService.getOne(id);    	
    }
    
    @PostMapping("/stage")
    public Stage save (@RequestBody Stage stage ){
        return service.save(stage);
    }

    @DeleteMapping("/stage/delete/{id}")
    public String deleteStage(Model model, @PathVariable int id) {
    	stageService.delete(id);
    	return "redirect:/stage";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

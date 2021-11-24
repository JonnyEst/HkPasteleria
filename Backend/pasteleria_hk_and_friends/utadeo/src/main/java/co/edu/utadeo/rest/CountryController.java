package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Country;
import co.edu.utadeo.service.CountryService;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/countries")
public class CountryController extends EntityController<Country> {

	@Autowired
	CountryService countryService;
    CountryController(CountryService service) {
        super(service);
    }

    @GetMapping("/country")
   	public ArrayList<Country> getCountry() {
   	   return countryService.getCountry();
   	}
    
    @GetMapping("/country/{id}")
    public Country getCountryOne(@PathVariable(value="id") int id) {
		return countryService.getOne(id);    	
    }
    
/*    @PutMapping("/{id}")
    public Country updateCountry(@PathVariable Integer id ,@RequestBody Country country) throws Exception {
        Country result = service.getOne(id);
        if(result == null){
            throw new Exception("Entity with id "+id+" not exists");
        }
        result.setName(country.getName());
        return service.save(result);
    }*/
    
    
    @PostMapping("/country")
    public Country save (@RequestBody Country country ){
        return service.save(country);
    }

    @DeleteMapping("/country/delete/{id}")
    public String deleteCountry(Model model, @PathVariable int id) {
    	countryService.delete(id);
    	return "redirect:/country";
    }
    
    @PutMapping("/country")
    public Country putCountry(@RequestBody Country country) {
    	return countryService.save(country);
    }
   
}

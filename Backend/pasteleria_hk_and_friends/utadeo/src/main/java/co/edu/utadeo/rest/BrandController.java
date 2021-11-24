package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Baker;
import co.edu.utadeo.domain.Brand;
import co.edu.utadeo.domain.Country;
import co.edu.utadeo.repository.BrandRepository;
import co.edu.utadeo.service.BrandService;

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
@RequestMapping("/api/brands")
public class BrandController extends EntityController<Brand>{

	@Autowired
	BrandService brandService;
    BrandController(BrandService service) {
        super(service);
    }
    
    @GetMapping("/brand")
 	public ArrayList<Brand> getPastryChef() {
 	   return brandService.getBrand();
 	}
    
    @PostMapping("/brand")
    public Brand save (@RequestBody Brand brand ){
        return service.save(brand);
    }


    @DeleteMapping("/brand/delete/{id}")
    public String deleteBrand(Model model, @PathVariable int id) {
    	brandService.delete(id);
    	return "redirect:/brand";
    }
    
}


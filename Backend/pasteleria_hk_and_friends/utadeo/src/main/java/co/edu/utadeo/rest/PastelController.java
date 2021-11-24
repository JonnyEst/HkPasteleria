package co.edu.utadeo.rest;

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

import co.edu.utadeo.domain.Pastel;
import co.edu.utadeo.service.PastelService;

@CrossOrigin
@RestController
@RequestMapping("/api/pasteles")
public class PastelController {

	
	@Autowired
	private PastelService pastelService;
	PastelController(PastelService service) {
		super();
	}
	
	@GetMapping("/pastel")
	public ArrayList<Pastel> getPastel() {
		return (ArrayList<Pastel>) pastelService.getPastel();
	}
	
	@GetMapping("/pastel/{id}")
	public Pastel getPastelOne(@PathVariable(value="id") int id) {
		return pastelService.getOne(id);
	}
	
	@PostMapping("/pastel")
	public Pastel save (@RequestBody Pastel pastel) {
		return pastelService.save(pastel);
	}
	
	@DeleteMapping("/pastel/delete/{id}")
	public String deletePastel(Model model, @PathVariable int id) {
		pastelService.delete(id);
		return "redirect:/pastel";
	}
	
	 @PutMapping("/pastel/{id}")
	    public Pastel putPastel(Pastel pastel, @PathVariable int id) {
		 pastelService.guardarPastel(pastel);
		 return pastelService.save(pastel);
	    }
	
		
	
}

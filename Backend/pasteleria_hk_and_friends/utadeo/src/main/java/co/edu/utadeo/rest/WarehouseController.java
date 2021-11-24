package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Warehouse;
import co.edu.utadeo.service.WarehouseService;

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
@RequestMapping("/api/warehouses")
public class WarehouseController extends EntityController<Warehouse>{

	@Autowired
	WarehouseService warehouseService;
	WarehouseController(WarehouseService service) {
        super(service);
    }
	
	@GetMapping("/warehouse")
   	public ArrayList<Warehouse> getWarehouse() {
   	   return warehouseService.getWarehouse();
   	}
    
    @GetMapping("/warehouse/{id}")
    public Warehouse getCountryOne(@PathVariable(value="id") int id) {
		return warehouseService.getOne(id);    	
    }

    @PostMapping("/warehouse")
    public Warehouse save (@RequestBody Warehouse warehouse ){
        return service.save(warehouse);
    }

    @DeleteMapping("/warehouse/delete/{id}")
    public String deleteWarehouse(Model model, @PathVariable int id) {
    	warehouseService.delete(id);
    	return "redirect:/country";
    }
    
    @PutMapping("/warehouse")
    public Warehouse putWarehouse(@RequestBody Warehouse warehouse) {
    	return warehouseService.save(warehouse);
    }
}

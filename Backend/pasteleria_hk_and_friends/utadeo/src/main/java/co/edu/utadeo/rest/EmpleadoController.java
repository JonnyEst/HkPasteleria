package co.edu.utadeo.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utadeo.domain.Empleado;
import co.edu.utadeo.service.EmpleadoService;

@CrossOrigin
@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	EmpleadoController(EmpleadoService service){
		super();
	}
	
	@GetMapping("/empleado")
	public ArrayList<Empleado> getEmpleado() {
		return (ArrayList<Empleado>) empleadoService.getEmpleado();
	}
	
	@GetMapping("/empleado/{id}")
	public Empleado getEmpleadoOne(@PathVariable(value="id" )int id) {
		return empleadoService.getOne(id);
	}

	@PostMapping("/empleado")
	public Empleado save (@RequestBody Empleado empleado) {
		return empleadoService.save(empleado);
	}
	
	@DeleteMapping("/empleado/delete/{id}")
	public String deleteEmpleado(Model model, @PathVariable int id) {
		empleadoService.delete(id);
		return "redirect:/empleado";
	}
	
	
	
}

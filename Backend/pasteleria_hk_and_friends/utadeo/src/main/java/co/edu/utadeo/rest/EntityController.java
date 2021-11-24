package co.edu.utadeo.rest;

import co.edu.utadeo.service.EntityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class EntityController<T> {

    public EntityService<T> service;

    EntityController(EntityService service){
        this.service = service;
    }

    @PostMapping()
    public T create(@RequestBody T entity){
        return service.save(entity);
    }

    @GetMapping()
    public List<T> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public T getOne(@PathVariable Integer id){
        return service.getOne(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable Integer id){
        service.delete(id);
    }
}

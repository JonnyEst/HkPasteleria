package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Ingredient;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}

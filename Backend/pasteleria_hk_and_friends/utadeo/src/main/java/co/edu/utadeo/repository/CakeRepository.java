package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Cake;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CakeRepository extends JpaRepository<Cake, Integer> {
}

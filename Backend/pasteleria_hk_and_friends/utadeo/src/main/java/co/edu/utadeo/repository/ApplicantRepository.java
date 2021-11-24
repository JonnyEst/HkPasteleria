package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Applicant;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {
}

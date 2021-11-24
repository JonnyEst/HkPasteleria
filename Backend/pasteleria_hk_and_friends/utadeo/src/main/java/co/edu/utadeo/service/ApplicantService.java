package co.edu.utadeo.service;

import co.edu.utadeo.domain.Applicant;
import co.edu.utadeo.domain.Employee;
import co.edu.utadeo.repository.ApplicantRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService extends EntityService<Applicant> {

	@Autowired
	private ApplicantRepository applicantRepository;
    ApplicantService(ApplicantRepository repository) {
        super(repository);
    }
  

    public ArrayList<Applicant> getApplicant() {
		return (ArrayList<Applicant>) applicantRepository.findAll();
	}
	
	public Applicant saveApplicant(Applicant applicant) {
		return applicantRepository.save(applicant);
	}
	
	@Override
	public void getForId(int id) {
		applicantRepository.findById(id);
	}


	

	
}

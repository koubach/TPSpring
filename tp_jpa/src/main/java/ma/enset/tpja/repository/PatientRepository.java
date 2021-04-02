package ma.enset.tpja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.enset.tpja.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long>{
	  public List<Patient> findByNomContains(String name);
	  public List<Patient> findByMalade(boolean b);
	  public List<Patient> findByNomContainsAndMalade(String name,boolean b);

}

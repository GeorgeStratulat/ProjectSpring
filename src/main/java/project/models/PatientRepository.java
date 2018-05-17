package project.models;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by George Stratulat on 17/04/2018.
 */

public interface PatientRepository extends CrudRepository<Patient,Integer> {
}

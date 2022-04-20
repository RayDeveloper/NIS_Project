//813117991

package com.example.demo;



import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long>{

	Optional<Employee> findById(Long id);//method declaration

	

	

}

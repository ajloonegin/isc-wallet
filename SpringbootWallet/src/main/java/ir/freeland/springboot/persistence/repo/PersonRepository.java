package ir.freeland.springboot.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ir.freeland.springboot.persistence.model.Person;


public interface PersonRepository extends CrudRepository<Person, Long> {
	
	List<Person> findByName(String name);
	
	Person findByNationalCode(String nationalcode);
	
	void deleteById(long id);
  

}


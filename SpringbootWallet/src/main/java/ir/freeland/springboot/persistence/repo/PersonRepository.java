package ir.freeland.springboot.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ir.freeland.springboot.persistence.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	
	List<Person> findByName(String name);
	
    @Query(value = "INSERT INTO ISC_PERSON (name,surName,nationalCode,birthDate,mobileNumber,gender,militaryStatus,email) VALUES (:name, :surName, :nationalCode, :birthDate, :mobileNumber,:gender, :militaryStatus, :email)", nativeQuery = true)
    @Modifying
    void insertPerson(@Param("name") String name, @Param("surName") String surName, @Param("nationalCode") String nationalCode, @Param("birthDate") String birthDate, @Param("mobileNumber") String mobileNumber,
    		@Param("gender") String gender, @Param("militaryStatus") String militaryStatus, @Param("email") String email);

}


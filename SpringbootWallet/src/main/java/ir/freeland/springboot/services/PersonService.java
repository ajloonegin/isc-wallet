package ir.freeland.springboot.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import ir.freeland.springboot.persistence.model.Person;
import ir.freeland.springboot.persistence.repo.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
    
    public void addNewPerson(String name,
    						 String surName,
    						 String nationalCode,
    						 String birthDate,
    						 String mobileNumber,
    						 String gender,
    						 String militaryStatus,
    						 String email) {
    	personRepository.insertPerson(name,surName,nationalCode,birthDate,mobileNumber,gender,militaryStatus,email);
    }
}

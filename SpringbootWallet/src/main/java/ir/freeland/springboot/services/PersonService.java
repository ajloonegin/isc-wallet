package ir.freeland.springboot.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import ir.freeland.springboot.dto.inputdto.AddPersonInputDto;
import ir.freeland.springboot.dto.inputdto.DeletePersonInputDto;
import ir.freeland.springboot.dto.inputdto.UpdatePersonInputDto;
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
    
    public Person createPerson(AddPersonInputDto addPersonInputDto) {
    	Person person=new Person();
    	person.setName(addPersonInputDto.getName());
    	person.setSurName(addPersonInputDto.getSurName());
    	person.setNationalCode(addPersonInputDto.getNationalCode());
    	person.setBirthDate(addPersonInputDto.getBirthDate());
    	person.setMobileNumber(addPersonInputDto.getMobileNumber());
    	person.setGender(addPersonInputDto.getGender());
    	person.setMilitaryStatus(addPersonInputDto.getMilitaryStatus());
    	person.setEmail(addPersonInputDto.getEmail());
    	return personRepository.save(person);
    }
    
    public Person findPersonByNationalCode(String nationalcode) {
        return personRepository.findByNationalCode(nationalcode);
    }
    
    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }
    
    public Person updatePerson(Long id, UpdatePersonInputDto updatePersonInputDto) {
        Person person = getPersonById(id);
        if (person != null) {
        	
        	person.setName(updatePersonInputDto.getName());
        	person.setSurName(updatePersonInputDto.getSurName());
        	person.setNationalCode(updatePersonInputDto.getNationalCode());
        	person.setBirthDate(updatePersonInputDto.getBirthDate());
        	person.setMobileNumber(updatePersonInputDto.getMobileNumber());
        	person.setGender(updatePersonInputDto.getGender());
        	person.setMilitaryStatus(updatePersonInputDto.getMilitaryStatus());
        	person.setEmail(updatePersonInputDto.getEmail());
            return personRepository.save(person);
        }
        return null;
    }
    
    public Person deletePerson(DeletePersonInputDto deletePersonInputDto) {
        Person person = getPersonById(deletePersonInputDto.getId());
        if (person != null) {
           personRepository.deleteById(deletePersonInputDto.getId());
        }
        return null;
    }
    
}

package ir.freeland.springboot.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ir.freeland.springboot.persistence.model.Person;
import ir.freeland.springboot.services.PersonService;

@Controller
public class MappingController {
	
	@Autowired
	private PersonService personService;

	@GetMapping("/home/adminpanel/findallperson")
	public List<Person> getPersons() {
	        return personService.getAllPersons();
	}
	
	@GetMapping("/home/adminpanel/findallperson")
    public String getPersons(Model model) {
        List<Person> persons = personService.getAllPersons();
        model.addAttribute("persons", persons); // Add the users to the model
        return "persons"; // Return the name of the JSP view
    }
	
	@GetMapping("/home")
    public String showHomePage() {
        return "sample";
    }
	
	
	@GetMapping("/home/adminpanel")
    public String showAdminPanelPage() {
        return "sample2";
    }
	
	@GetMapping("/home/userpanel")
    public String showUserPanelPage() {
        return "sample3";
    }
	
	
	@GetMapping("/home/adminpanel/addperson")
    public String addPerson() {
        return "sample4";
    }
	
	@PostMapping("/home/adminpanel/addperson/result")
    public String addPersonResult(@RequestParam("name") String name,
    		@RequestParam("surName") String surName,
    		@RequestParam("nationalCode") String nationalCode,
    		@RequestParam("birthDate") String birthDate,
    		@RequestParam("mobileNumber") String mobileNumber,
            @RequestParam("gender") String gender,
            @RequestParam("militaryStatus") String militaryStatus,
            @RequestParam("email") String email,
            Model model) {
		personService.addNewPerson(name,surName,nationalCode,birthDate,mobileNumber,gender,militaryStatus,email);
        
        model.addAttribute("message", "Thank you for registering, " + name + "! We have received your details.");
       
        return "resultaddnewperson";
    }
	
	
	
	@GetMapping("/home/adminpanel/findperson")
    public String findPerson() {
        return "sample";
    }
	
	@GetMapping("/home/adminpanel/updateperson")
    public String updatePerson() {
        return "sample";
    }
	
	@GetMapping("/home/adminpanel/deleteperson")
    public String deletePerson() {
        return "sample";
    }
	
	
	@GetMapping("/home/adminpanel/addaccount")
    public String addAccount() {
        return "sample";
    }
	
	
	@GetMapping("/home/adminpanel/findaccount")
    public String findAccount() {
        return "sample";
    }
	
	@GetMapping("/home/adminpanel/updateaccount")
    public String updateAccount() {
        return "sample";
    }
	
	@GetMapping("/home/adminpanel/deleteaccount")
    public String deleteAccount() {
        return "sample";
    }
	
	@GetMapping("/home/userpanel/deposit")
    public String deposit() {
        return "sample";
    }
	
	@GetMapping("/home/userpanel/withdraw")
    public String withdraw() {
        return "sample";
    }
	
	@GetMapping("/home/userpanel/listoftransaction")
    public String showListOfTransaction() {
        return "sample";
    }
	
	
	
	
    @GetMapping("/sample")
    public String showForm() {
        return "sample";
    }
    
    @GetMapping("/sample2")
    public String showForm2() {
        return "sample2";
    }
    
    @GetMapping("/sample3")
    public String showForm3() {
        return "sample3";
    }
    @GetMapping("/sample4")
    public String showForm4() {
        return "sample4";
    }
    
    @GetMapping("/registerform")
    public String showRegisterForm() {
        return "registerform";
    }
    
    @PostMapping("/result")
    public String showResult() {
        return "result";
    }

}

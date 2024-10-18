package ir.freeland.springboot.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ir.freeland.springboot.dto.inputdto.AddAccountInputDto;
import ir.freeland.springboot.dto.inputdto.AddPersonInputDto;
import ir.freeland.springboot.dto.inputdto.DeleteAccountInputDto;
import ir.freeland.springboot.dto.inputdto.DeletePersonInputDto;
import ir.freeland.springboot.dto.inputdto.DepositInputDto;
import ir.freeland.springboot.dto.inputdto.FindAccountInputDto;
import ir.freeland.springboot.dto.inputdto.FindPersonInputDto;
import ir.freeland.springboot.dto.inputdto.UpdateAccountInputDto;
import ir.freeland.springboot.dto.inputdto.UpdatePersonInputDto;
import ir.freeland.springboot.dto.inputdto.WithdrawInputDto;
import ir.freeland.springboot.persistence.model.Person;
import ir.freeland.springboot.persistence.model.Account;
import ir.freeland.springboot.services.AccountService;
import ir.freeland.springboot.services.PersonService;

@Controller
public class MappingController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private AccountService accountService;

	

	
	//page1
	@GetMapping("/home")
    public String showHomePage() {
        return "sample";
    }
	
	//page admin panel if choose admin panel button
	@GetMapping("/home/adminpanel")
    public String showAdminPanelPage() {
        return "sample2";
    }
	
	//page user panel if choose user panel button
	@GetMapping("/home/userpanel")
    public String showUserPanelPage() {
        return "sample3";
    }
	
	
	//page add person-admin panel if choose add person button
	@GetMapping("/home/adminpanel/addperson")
    public String addPerson(Model model) {
		model.addAttribute("addpersoninputDto", new AddPersonInputDto());
        return "sample4";
    }
	
	@PostMapping(value="/home/adminpanel/addperson/result" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
    public String addPersonResult(AddPersonInputDto addPersonInputDto) {
		
		personService.createPerson(addPersonInputDto);
       
        return "resultaddnewperson";
    }
	
	//page add account-admin panel if choose add account button
	@GetMapping("/home/adminpanel/addaccount")
    public String addAccount(Model model) {
		model.addAttribute("addAccountInputDto", new AddAccountInputDto());
        return "sample9";
    }
	
	@PostMapping("/home/adminpanel/addaccount/result")
	public String addAccountResult(AddAccountInputDto addAccountInputDto) {
		accountService.createAccount( addAccountInputDto);
	       
	       return "resultaddaccount";
	   }
	
	@GetMapping("/home/adminpanel/findallperson")
	public List<Person> getPersons() {
	        return personService.getAllPersons();
	} 
	
	@GetMapping("/home/adminpanel/findperson")
    public String findPerson(Model model) {
		model.addAttribute("findPersonInputDto", new FindPersonInputDto());
        return "sample6";
    }
	
	@PostMapping(value="/home/adminpanel/findperson/result")
    public String findPersonResult(FindPersonInputDto findPersonInputDto) {
		
		Person person=personService.findPersonByNationalCode(findPersonInputDto.getNationalCode());
        System.out.println(person);
        return "resultfindperson";
    }
	
	@GetMapping("/home/adminpanel/findaccount")
    public String findAccount(Model model) {
		model.addAttribute("findAccountInputDto", new FindAccountInputDto());
        return "sample10";
    }
	
	@GetMapping("/home/adminpanel/findallaccount")
	public List<Account> getAccounts() {
	        return accountService.getAllAccounts();
	} 
	@PostMapping(value="/home/adminpanel/findaccount/result")
    public String findAccountResult(FindAccountInputDto findAccountInputDto) {
		
		Account account=accountService.findAccountByAccountNumber(findAccountInputDto.getAccountNumber());
        System.out.println(account);
        return "resultfindaccount";
    }
	
	@GetMapping("/home/adminpanel/updateperson")
    public String updatePerson(Model model) {
		model.addAttribute("updatepersoninputdto", new UpdatePersonInputDto());
        return "sample7";
    }
	
	@PostMapping("/home/adminpanel/updateperson/result")
	public String updatePersonResult(UpdatePersonInputDto updatePersonInputDto) {
	       personService.updatePerson(updatePersonInputDto.getId(), updatePersonInputDto);
	       
	       return "redirect:/home/adminpanel/findallperson";
	   }
	
	@GetMapping("/home/adminpanel/updateaccount")
    public String updateAccount(Model model) {
		model.addAttribute("updateAccountInputDto", new UpdateAccountInputDto());
        return "sample11";
    }
	
	@PostMapping("/home/adminpanel/updateaccount/result")
	public String updateAccountResult(UpdateAccountInputDto updateAccountInputDto) {
	       accountService.updateAccount(updateAccountInputDto.getId(), updateAccountInputDto);
	       
	       return "redirect:/home/adminpanel/findallaccount";
	   }
	
	@GetMapping("/home/adminpanel/deleteperson")
    public String deletePerson() {
        return "sample8";
    }
	
	@PostMapping("/home/adminpanel/deleteperson/result")
	public String deletePersonResult(DeletePersonInputDto deletePersonInputDto) {
	       personService.deletePerson( deletePersonInputDto);
	       
	       return "redirect:/home/adminpanel/findallperson";
	   }
	
	@GetMapping("/home/adminpanel/deleteaccount")
    public String deleteAccount(Model model) {
		model.addAttribute("deleteAccountInputDto", new DeleteAccountInputDto());
        return "sample12";
    }
	
	@PostMapping("/home/adminpanel/deleteaccount/result")
	public String deleteAccountResult(DeleteAccountInputDto deleteAccountInputDto) {
	       accountService.deleteAccount(deleteAccountInputDto);
	       
	       return "redirect:/home/adminpanel/findallaccount";
	   }
	
	

	
	
	
	
	@GetMapping("/home/userpanel/deposit")
    public String deposit(Model model) {
		model.addAttribute("depositInputDto", new DepositInputDto());
        return "sample13";
        
    }
	
	@PostMapping("/home/userpanel/deposit/result")
	public String depositResult(DepositInputDto depositInputDto) {
	       accountService.deposit(depositInputDto);
	       return "redirect:/home/adminpanel/findallaccount";
	   }
	
	@GetMapping("/home/userpanel/withdraw")
    public String withdraw(Model model) {
		model.addAttribute("withdrawInputDto", new WithdrawInputDto());
        return "sample14";
        
    }
	
	@PostMapping("/home/userpanel/withdraw/result")
	public String withdrawResult(WithdrawInputDto withdrawInputDto) {
	       accountService.withdraw(withdrawInputDto);
	       return "redirect:/home/adminpanel/findallaccount";
	   }
	
	@GetMapping("/home/userpanel/listoftransaction")
    public String showListOfTransaction() {
        return "sample";
    }
	
	@PostMapping("/home/userpanel/listoftransaction/result")
	public String listOfTransactionResult(DepositInputDto depositInputDto) {
	       accountService.deposit(depositInputDto);
	       return "redirect:/home/adminpanel/findallaccount";
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
    
    
	//check it

	
	
	@GetMapping("/home/adminpanel/findallperson")
    public String getPersons(Model model) {
        List<Person> persons = personService.getAllPersons();
        model.addAttribute("persons", persons); // Add the users to the model
        return "persons"; // Return the name of the JSP view
    }

}

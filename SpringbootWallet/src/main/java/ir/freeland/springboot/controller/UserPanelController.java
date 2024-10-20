package ir.freeland.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ir.freeland.springboot.dto.inputdto.DepositInputDto;
import ir.freeland.springboot.dto.inputdto.TransactionInputDto;
import ir.freeland.springboot.dto.inputdto.TransferInputDto;
import ir.freeland.springboot.dto.inputdto.WithdrawInputDto;
import ir.freeland.springboot.services.AccountService;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = "/home/userpanel")
public class UserPanelController {

	

	@Autowired
	private AccountService accountService;

	
	
	@GetMapping(value ="/")
	
	public String showUserPanelPage() {
		return "sample3";
	}

	
	@GetMapping(value ="/deposit")
	
	public String deposit(Model model) {
		model.addAttribute("depositInputDto", new DepositInputDto());
		return "sample13";

	}

	
	@PostMapping(value ="/deposit/result")
	
	public String depositResult(@Valid @RequestBody DepositInputDto depositInputDto) {
		accountService.deposit(depositInputDto);
		return "redirect:/home/adminpanel/findallaccount";
	}

	@GetMapping(value ="/withdraw")
	
	public String withdraw(Model model) {
		model.addAttribute("withdrawInputDto", new WithdrawInputDto());
		return "sample14";

	}

	@PostMapping(value ="/withdraw/result")
	
	public String withdrawResult(@Valid @RequestBody WithdrawInputDto withdrawInputDto) {
		accountService.withdraw(withdrawInputDto);
		return "redirect:/home/adminpanel/findallaccount";
	}

	@GetMapping(value ="/transfer")
	
	public String transfer(Model model) {
		model.addAttribute("transferInputDto", new TransferInputDto());
		return "sample15";

	}

	@PostMapping(value ="/transfer/result")
	
	public String transferResult(@Valid @RequestBody TransferInputDto transferInputDto) {
		accountService.transfer(transferInputDto);
		return "redirect:/home/adminpanel/findallaccount";
	}

	@GetMapping(value ="/listoftransaction")
	
	public String showListOfTransaction() {
		return "sample16";
	}

	@PostMapping(value ="/listoftransaction/result")
	
	public String listOfTransactionResult(@Valid @RequestBody TransactionInputDto transactionInputDto) {
		accountService.showTransaction(transactionInputDto);
		return "resulttransactions";
	}

}

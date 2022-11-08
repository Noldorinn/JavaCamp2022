package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.io.devs.business.requests.languageRequests.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.languageResponses.GetAllLanguagesResponse;
import kodlama.io.devs.business.responses.languageResponses.GetLanguageByIdResponse;

@RestController //annotation
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add/language")
	public void add(CreateLanguageRequest createLanguageRequest) {
		this.languageService.add(createLanguageRequest);
	}
	
	@PutMapping("/update/language")
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		languageService.update(updateLanguageRequest);
	}
	
	@DeleteMapping("/delete/language")
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		languageService.delete(deleteLanguageRequest);
	}
	
	@GetMapping("/getId/{id}")
	public GetLanguageByIdResponse getById(@PathVariable int id) {
		return languageService.getById(id);
	}
	
}

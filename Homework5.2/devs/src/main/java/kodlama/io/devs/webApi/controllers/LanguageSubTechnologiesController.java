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

import kodlama.io.devs.business.abstracts.LanguageSubTechService;
import kodlama.io.devs.business.requests.languageSubTechRequests.CreateLanguageSubTechRequest;
import kodlama.io.devs.business.requests.languageSubTechRequests.DeleteLanguageSubTechRequest;
import kodlama.io.devs.business.requests.languageSubTechRequests.UpdateLanguageSubTechRequest;
import kodlama.io.devs.business.responses.languageSubTechResponses.GetAllLanguageSubTechsResponse;
import kodlama.io.devs.business.responses.languageSubTechResponses.GetLanguageSubTechByIdResponse;

@RestController
@RequestMapping("/api/languages/techs")
public class LanguageSubTechnologiesController {
	private LanguageSubTechService languageSubTechService;

	@Autowired
	public LanguageSubTechnologiesController(LanguageSubTechService languageSubTechService) {
		super();
		this.languageSubTechService = languageSubTechService;
	}
	
	@PostMapping("/add/tech")
	public void add(CreateLanguageSubTechRequest createLanguageSubTechRequest) {
		this.languageSubTechService.add(createLanguageSubTechRequest);
	}
	
	@GetMapping("/getalltech")
	public List<GetAllLanguageSubTechsResponse> getAll(){
		return this.languageSubTechService.getAll();
	}
	
	@DeleteMapping("/delete/tech")
	public void delete(DeleteLanguageSubTechRequest deleteLanguageSubTechRequest) {
		this.languageSubTechService.delete(deleteLanguageSubTechRequest);
	}
	
	@GetMapping("/getTechId/{id}")
	public GetLanguageSubTechByIdResponse getId(@PathVariable int id) {
		return this.languageSubTechService.getById(id);
	}
	
	@PutMapping("/update/tech")
	public void update(UpdateLanguageSubTechRequest languageSubTechRequest) {
		this.languageSubTechService.update(languageSubTechRequest);
	}
	
}

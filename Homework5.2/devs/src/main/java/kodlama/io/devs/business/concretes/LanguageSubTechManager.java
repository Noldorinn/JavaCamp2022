package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageSubTechService;
import kodlama.io.devs.business.requests.languageSubTechRequests.CreateLanguageSubTechRequest;
import kodlama.io.devs.business.requests.languageSubTechRequests.DeleteLanguageSubTechRequest;
import kodlama.io.devs.business.requests.languageSubTechRequests.UpdateLanguageSubTechRequest;
import kodlama.io.devs.business.responses.languageSubTechResponses.GetAllLanguageSubTechsResponse;
import kodlama.io.devs.business.responses.languageSubTechResponses.GetLanguageSubTechByIdResponse;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.dataAccess.abstracts.LanguageSubTechRepository;
import kodlama.io.devs.entities.concretes.Language;
import kodlama.io.devs.entities.concretes.LanguageSubTechnology;

@Service
public class LanguageSubTechManager implements LanguageSubTechService{
	private LanguageSubTechRepository languageSubTechRepository;
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageSubTechManager(LanguageSubTechRepository languageSubTechRepository,
			LanguageRepository languageRepository) {
		this.languageSubTechRepository = languageSubTechRepository;
		this.languageRepository = languageRepository;
	}


	@Override
	public List<GetAllLanguageSubTechsResponse> getAll() {
		List<LanguageSubTechnology> languageSubTechnologies = languageSubTechRepository.findAll();
		List<GetAllLanguageSubTechsResponse> techsResponses = new ArrayList<GetAllLanguageSubTechsResponse>();
		
		for (LanguageSubTechnology subtechs : languageSubTechnologies) {
			GetAllLanguageSubTechsResponse responseItem = new GetAllLanguageSubTechsResponse();
			responseItem.setId(subtechs.getId());
			responseItem.setName(subtechs.getName());
			responseItem.setLanguage(subtechs.getLanguage().getName());
			
			techsResponses.add(responseItem);
		}
		
		return techsResponses;
	}

	@Override
	public void add(CreateLanguageSubTechRequest createLanguageSubTechRequest) {
		LanguageSubTechnology subTechnology = new LanguageSubTechnology();
		subTechnology.setName(createLanguageSubTechRequest.getName());;
		Language language = languageRepository.findById(createLanguageSubTechRequest.getLanguageId()).get();
		subTechnology.setLanguage(language);
		
		if (!isExist(subTechnology)) {
			languageSubTechRepository.save(subTechnology);
		}else {
			throw new RuntimeException("This subtechnology has already added.");
		}
		
	}

	@Override
	public void update(UpdateLanguageSubTechRequest updateLanguageSubTechRequest) {
		LanguageSubTechnology languageSubTechnology = this.languageSubTechRepository.findById(updateLanguageSubTechRequest.getId()).get();
		languageSubTechnology.setName(updateLanguageSubTechRequest.getNewName());
		
		Language language = this.languageRepository.findById(updateLanguageSubTechRequest.getId()).get();
		languageSubTechnology.setLanguage(language);
		
		this.languageSubTechRepository.save(languageSubTechnology);
		
	}

	@Override
	public void delete(DeleteLanguageSubTechRequest deleteLanguageSubTechRequest) {
		this.languageSubTechRepository.deleteById(deleteLanguageSubTechRequest.getId());
		
	}

	@Override
	public GetLanguageSubTechByIdResponse getById(int id) {
		LanguageSubTechnology languageSubTechnology = this.languageSubTechRepository.findById(id).get();
		GetLanguageSubTechByIdResponse byIdResponse = new GetLanguageSubTechByIdResponse();
		byIdResponse.setName(languageSubTechnology.getName());
		byIdResponse.setId(languageSubTechnology.getId());
		byIdResponse.setLanguage(languageSubTechnology.getLanguage().getName());
		
		return null;
	}
	
	public boolean isExist(LanguageSubTechnology languageSubTechnology) {
		boolean exist = false;
		List<LanguageSubTechnology> languageSubTechnologies = languageSubTechRepository.findAll();
		for (LanguageSubTechnology languageSubTechs : languageSubTechnologies) {
			if (languageSubTechs.getName().toLowerCase().equals(languageSubTechnology.getName().toLowerCase())) {
				if (languageSubTechs.getLanguage().equals(languageSubTechnology.getLanguage())) {
					exist = true;
				}
			}
		}
		return exist;
		
	}

}

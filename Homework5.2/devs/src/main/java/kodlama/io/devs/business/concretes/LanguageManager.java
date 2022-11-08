package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.io.devs.business.requests.languageRequests.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.languageResponses.GetAllLanguagesResponse;
import kodlama.io.devs.business.responses.languageResponses.GetLanguageByIdResponse;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Service //Bu sınıf bir business nesnesidir
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}


	@Override
	public List<GetAllLanguagesResponse> getAll() {
		
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponses = new ArrayList<GetAllLanguagesResponse>();
		
		for (Language language : languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			
			languagesResponses.add(responseItem);
		}
		
		// iş kuralları
		return languagesResponses;
	}



	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		
		if (!isExist(language)) {
			this.languageRepository.save(language);
		}else {
			throw new RuntimeException("This language alrady added!");
		}
		
		
	}
	

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		Language language = this.languageRepository.findById(updateLanguageRequest.getId()).get();
		language.setName(updateLanguageRequest.getNewname());
		if (!isExist(language)) {
			this.languageRepository.save(language);
		}else {
			throw new RuntimeException("This language already exist!");
		}
	}


	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		this.languageRepository.deleteById(deleteLanguageRequest.getId());
		
	}


	@Override
	public GetLanguageByIdResponse getById(int id) {
		Language language = this.languageRepository.findById(id).get();
		GetLanguageByIdResponse byIdResponse = new GetLanguageByIdResponse();
		byIdResponse.setId(language.getId());
		byIdResponse.setName(language.getName());
		
		return byIdResponse;
	}

	public boolean isExist(Language language) {
		boolean exist = false;
		List<Language> languages = languageRepository.findAll();
		for (Language language2 : languages) {
			if (language2.getName().toLowerCase().equals(language.getName().toLowerCase())) {
				exist = true;
				return exist;
			}
		}
		return exist;
	}
	


	

}

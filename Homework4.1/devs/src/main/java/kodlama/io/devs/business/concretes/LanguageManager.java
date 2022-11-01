package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageService;
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
	public List<Language> getAll() {
		// iş kuralları
		return languageRepository.getAll();
	}


	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}


	@Override
	public void create(Language language) throws Exception {
		if (isLanguageExist(language)) {
			throw new Exception("Language already exists");
		}
		
		if (checkLanguageNameValid(language)) {
			throw new Exception("Language name is invalid");
		}
		
		languageRepository.create(language);
	}


	@Override
	public void update(int id, Language language) throws Exception {
		if (isLanguageExist(language)) {
			throw new Exception("Language already exists");
		}
		
		if (checkLanguageNameValid(language)) {
			throw new Exception("Language name is invalid");
		}
		
		languageRepository.update(id, language);
	}


	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}
	
	public boolean isLanguageExist(Language language) {
		return languageRepository.getAll().stream().anyMatch(l -> l.getName().equals(language.getName()));}
	
	public boolean checkLanguageNameValid(Language language) {
		return language.getName().isEmpty()|| language.getName().isBlank()||language.getName().length()<2;
		
	}


	


	

}

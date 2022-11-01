package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Repository //bu sınıf bir DataAccess nesnesidir
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(1,"Java"));
		languages.add(new Language(1,"Phython"));
		
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language getById(int id) {
		
		for (Language language : languages) {
			if (language.getId()== id) return language;
		}
		return null;
	}

	@Override
	public void create(Language language) {
		languages.add(language);
	}

	@Override
	public void update(int id, Language language) {
		Language newLanguage = getById(id);
		newLanguage.setName(language.getName());
	}

	@Override
	public void delete(int id) {
		Language language = getById(id);
		languages.remove(language);
	}

}

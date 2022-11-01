package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageService {
	//iş kuralları
	List<Language> getAll();
	Language getById(int id);
	void create(Language language) throws Exception;
	void update(int id,Language language) throws Exception;
	void delete(int id);
}

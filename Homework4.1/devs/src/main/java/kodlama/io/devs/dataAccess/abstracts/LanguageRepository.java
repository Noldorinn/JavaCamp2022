package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	Language getById(int id);
	void create(Language language);
	void update(int id,Language language);
	void delete(int id);
}

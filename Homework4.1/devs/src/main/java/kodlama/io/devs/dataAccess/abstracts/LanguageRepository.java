package kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
	
	/*
	 * Language getById(int id); void create(Language language); void update(int
	 * id,Language language); void delete(int id);
	 */
}

package kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.devs.entities.concretes.LanguageSubTechnology;

public interface LanguageSubTechRepository extends JpaRepository<LanguageSubTechnology, Integer>{

}

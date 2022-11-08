package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.CreateLanguageRequest;
import kodlama.io.devs.business.requests.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.devs.business.responses.GetLanguageByIdResponse;

public interface LanguageService {
	//iş kuralları
	List<GetAllLanguagesResponse> getAll();
	//Language getById(int id); //yasak veritabanı nesnesi kullanmak
	//void create(Language language) throws Exception;
	//void update(int id,Language language) throws Exception;
	//void delete(int id);
	void add(CreateLanguageRequest createLanguageRequest);
	GetLanguageByIdResponse getById(int id); 
	//UpdateLanguageRequest update(int id, String newname);
	void update(UpdateLanguageRequest updateLanguageRequest);
	//void getById(GetLanguageByIdResponse getLanguageByIdResponse);
	void delete(DeleteLanguageRequest deleteLanguageRequest);
}

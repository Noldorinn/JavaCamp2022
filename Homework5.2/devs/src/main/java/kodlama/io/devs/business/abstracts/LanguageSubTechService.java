package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.languageSubTechRequests.CreateLanguageSubTechRequest;
import kodlama.io.devs.business.requests.languageSubTechRequests.DeleteLanguageSubTechRequest;
import kodlama.io.devs.business.requests.languageSubTechRequests.UpdateLanguageSubTechRequest;
import kodlama.io.devs.business.responses.languageSubTechResponses.GetAllLanguageSubTechsResponse;
import kodlama.io.devs.business.responses.languageSubTechResponses.GetLanguageSubTechByIdResponse;

public interface LanguageSubTechService {
	//iş kuralları
	List<GetAllLanguageSubTechsResponse> getAll();
	void add(CreateLanguageSubTechRequest createLanguageSubTechRequest);
	void update(UpdateLanguageSubTechRequest updateLanguageSubTechRequest);
	void delete(DeleteLanguageSubTechRequest deleteLanguageSubTechRequest);
	GetLanguageSubTechByIdResponse getById(int id);
	
}

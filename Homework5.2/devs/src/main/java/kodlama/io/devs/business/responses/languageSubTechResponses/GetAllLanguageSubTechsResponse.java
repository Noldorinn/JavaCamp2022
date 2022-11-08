package kodlama.io.devs.business.responses.languageSubTechResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguageSubTechsResponse {
	private int id;
	private String name;
	private String language;
}

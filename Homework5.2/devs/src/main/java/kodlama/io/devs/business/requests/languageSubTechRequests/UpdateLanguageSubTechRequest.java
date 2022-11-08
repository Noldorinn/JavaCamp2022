package kodlama.io.devs.business.requests.languageSubTechRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageSubTechRequest {
	private int id;
	private String newName;
	private int languageId;
}

package kodlama.io.devs.business.requests.languageSubTechRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageSubTechRequest {
	private String name;
	private int languageId;
}

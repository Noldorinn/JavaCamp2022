package kodlama.io.devs.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	@NotNull(message = "Language name cannot be null")
	private String name;
	
	@OneToMany(mappedBy = "language")
	private List<LanguageSubTechnology> languageSubTechnologies;
}

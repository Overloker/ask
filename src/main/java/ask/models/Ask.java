package ask.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Vlad")
public class Ask {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	private String author;
	
	@NotEmpty
    private String text;
  
    
    public Ask() { //TODO for DB
		super();
	}

	public Ask(String author, String text) {
		super();
		this.author = author;
		this.text = text;
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	


	
	
}

package youTubeDemo;

public class Customer {
	
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı");
	}
	
	//SOLID
	public int Id;
	public String FirstName;
	public String LastName;
	public String NationalIdendity;
	public String TaxNumber;
	public String City;
	
	
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	
	
	
	public void Save() {
		System.out.println("Müşteri kaydedildi.");
	}
	
	
}

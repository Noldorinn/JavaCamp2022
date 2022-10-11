package youTubeDemo;

public class CustomerManager {
	//Katmanlı Mimariler
	
	private Customer _customer;
	private ICreditManager _CreditManager; //interfaceler referans tiptir.
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer=customer;
		_CreditManager=creditManager;
	}
	
	public void Save() {
		System.out.println("Müşteri kaydedildi: ");
}
	
	public void Delete() {
		System.out.println("Müşteri silindi: ");
}
	
	public void GiveCredit() {
		_CreditManager.Calculate();
		System.out.println("Kredi verildi");
	}
	
}
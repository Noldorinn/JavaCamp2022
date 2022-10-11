package youTubeDemo;

public class Main {

	public static void main(String[] args) {
		//https://www.youtube.com/watch?v=H3QOQRh8cgk&list=PLqG356ExoxZWfcrBP53Njxir4a-OgqRki&index=3
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer();
		customer.Id=1;
		customer.City="Ankara";
		
		//IoC Container
		CustomerManager customerManager=new CustomerManager(new Customer(), new TeacherCreditManager()); //örneğini oluşturmak
																		//instance oluşturmak
																		//instance creation
		customerManager.GiveCredit();
		customerManager.Save();
		customerManager.Delete();
		
		
		Company company = new Company();
		company.TaxNumber="100000";
		company.CompanyName="Arçelik";
		company.Id=100;
		
		//CustomerManager customerManager2 = new CustomerManager(new Person());
		
		
		Person person = new Person();
		person.FirstName="";
		person.NationalIdendity="";
		
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {10,20,30};
		sayilar1=sayilar2;
		
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]);
		

	}

}

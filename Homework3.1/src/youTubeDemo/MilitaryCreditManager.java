package youTubeDemo;


public class MilitaryCreditManager implements ICreditManager{

	@Override
	public void Calculate() {
		System.out.println("Asker kredisi hesaplandı");
		
	}
	//DRY - Do NOT Repeat Yourself abstract class kullanabiliriz
	@Override
	public void Save() {
		System.out.println("Kaydedildi");
		
	}

}


public class arkadasSayilar {
	public static void main(String[] args) {
	       //220-284 kendileri hariç pozitif tam bölenleri toplamı biribirine eşit
	        //benim yapmaya çalıştığım:
	       int sayi11 = 105;
	       int toplam = 0;
	       int sayi22 = 0;

	        for (int i=1; i<sayi11; i++){
	            if(sayi11 % i == 0){
	                toplam+=i;
	            }
	        }
	        System.out.println(toplam);

	        for (int i=1; i<toplam;i++){
	            if(toplam % i == 0){
	                sayi22+=i;
	            }
	        }
	        System.out.println(sayi22);

	        if(sayi11==sayi22){
	            System.out.println(sayi11 + " ve " +sayi22+" arkadaş sayılardır.");
	        }else {
	            System.out.println("Arkadaş sayı değillerdir.");
	        }

	        //hocanın yaptığı
	        int sayi1=220;
	        int sayi2=284;
	        int toplam1=0;
	        int toplam2=0;

	        for (int i=1;i<sayi1;i++){
	            if (sayi1%i==0){
	                toplam1=toplam1+i;
	            }
	        }

	        for (int i=1;i<sayi2;i++){
	            if (sayi2%i==0){
	                toplam2=toplam2+i;
	            }
	        }

	        if (sayi1==toplam2 && sayi2==toplam1){
	            System.out.println("bu iki sayı arkadaştır");
	        }else {
	            System.out.println("bu iki sayı arkadaş değildir");
	        }
	    }
	}


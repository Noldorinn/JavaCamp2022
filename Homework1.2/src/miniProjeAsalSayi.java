
public class miniProjeAsalSayi {
    public static void main(String[] args) {
        int number =1;
        int remainder =  number % 2;
        //System.out.println(remainder);

        //benim yaptığım:
        if (number % 2 == 0 &&  number != 2 ){
            System.out.println(number + " asal değildir.");
        }else if (number % 3 == 0 &&  number != 3){
            System.out.println(number + " asal değildir.");
        }else if (number % 5 == 0 &&  number != 5){
            System.out.println(number + " asal değildir.");
        }else if (number % 7 == 0 &&  number != 7){
            System.out.println(number + " asal değildir.");
        }else if (number < 2){
            System.out.println(number + " asal değildir.");
        }else {
            System.out.println(number + " asal sayıdır.");
        }

        //engin hocanın yaptığı:
        boolean isPrime = true;

        if (number==1){
            System.out.println("Sayı asal değildir");
            return;
        }

        if (number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i=2; i<number; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("Sayı asaldır");
        }else {
            System.out.println("Sayı asal değildir");
        }



    }
}
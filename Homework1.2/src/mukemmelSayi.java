
public class mukemmelSayi {
    public static void main(String[] args) {
        // 6 ---> 1,2,3
        // 28 --->1,2,4,7,14

        //benim yaptığım:
        int number = 5;
        int toplam =0;

        for (int i=1;i<number;i++){
            if (number % i ==0){
                toplam+=i;
            }
        }
        if(toplam==number){
            System.out.println(number + " mükemmel sayıdır.");
        }else {
            System.out.println(number+ " mükemmel sayı değildir");
        }

        //hocanın yaptığı:
        int total= 0;

        for (int i=1;i<number;i++){
            if (number % i == 0){
                total = total + i;
            }
        }

        if(total == number){
            System.out.println("Mükemmel sayıdır");
        }else {
            System.out.println("Mükemmel sayı değildir");
        }
    }
}

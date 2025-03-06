import java.awt.*;
import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi = sc.nextInt(); //kullanıcıdan sayı al
        if (AsalMi(sayi)) {
            System.out.println(sayi + " asaldir");
        } else {
            System.out.println(sayi + " asal degildir");
        }
    }
        public static boolean AsalMi(int sayi){
            if(sayi<2){
                return false;                }
            for(int i=2; i<=Math.sqrt(sayi);i++){

                if (sayi%i==0) {
                    return false;
                }
            }
return true;
        }

            }




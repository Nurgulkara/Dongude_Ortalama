import java.util.Scanner;

public class Dongude_Ortalama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k;
        double ortalama;
        float toplam=0, sayi=0;



        System.out.print("Bir sayi giriniz : ");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 12 == 0) {
                toplam += i;
                sayi += 1;
            }
        }
        ortalama = toplam / sayi;
        System.out.println("3'e ve 4'e bolunebilen sayilarin ortalamasi : " + ortalama);
    }

}